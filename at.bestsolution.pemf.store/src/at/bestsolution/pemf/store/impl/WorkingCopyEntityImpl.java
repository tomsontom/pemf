/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.pemf.store.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import at.bestsolution.pemf.store.PDatasource;
import at.bestsolution.pemf.store.PKey;
import at.bestsolution.pemf.store.PTransaction;
import at.bestsolution.pemf.store.PDatasource.Entry;
import at.bestsolution.pemf.store.PQuery;
import at.bestsolution.pemf.store.spi.PEStore;
import at.bestsolution.pemf.store.spi.PersistedEntity;
import at.bestsolution.pemf.store.spi.PersistedEntityManager;
import at.bestsolution.pemf.store.spi.WorkingCopyEntity;

public class WorkingCopyEntityImpl implements WorkingCopyEntity {
	private PersistedEntityImpl entity;
	private Map<EStructuralFeature, Object> data = new HashMap<>();
	private PersistedEntityManager entityManager;
	private PDatasource datasource;
	private PTransaction<EObject> transaction;
	
	public WorkingCopyEntityImpl(PersistedEntityImpl entity, PTransaction<EObject> transaction, PersistedEntityManager entityManager, PDatasource datasource) {
		this.entity = entity;
		this.entityManager = entityManager;
		this.datasource = datasource;
		this.transaction = transaction;
	}

//	@Override
//	public EObject getOwner() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public EStructuralFeature getContainingFeature() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Object get(EStructuralFeature feature) {
		Object rv = data.get(feature);
		if (rv == null) {
			if( feature instanceof EReference ) {
				Object ref = entity.get(feature);
				if( ref != null ) {
					rv = transaction.loadEntity(new PKey((EClass) feature.getEType(), ref));	
				}
			} else {
				rv = entity.get(feature);	
			}
			
		}
		return rv;
	}

	@Override
	public Object set(EStructuralFeature feature, Object value) {
		if( data.containsKey(feature) ) {
			Object rv = data.put(feature, value);
			return rv;
		} else {
			data.put(feature, value);
			return entity.get(feature);
		}
	}

	@Override
	public Object get(EStructuralFeature feature, int index) {
		return transaction.loadEntity(new PKey((EClass) feature.getEType(), internalGetPersistedList(feature).get(index).getId()));
	}

	@Override
	public Object set(EStructuralFeature feature, int index, Object value) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<PersistedEntity> internalGetPersistedList(EStructuralFeature feature) {
		if( data.containsKey(feature) ) {
			return ((List<PersistedEntity>)data.get(feature));
		} else {
			List<PersistedEntity> rv = entity.get(feature);
			if( rv == null ) {
				rv = new ArrayList<>();
				EReference r = (EReference) feature;
				EClass eClass = (EClass) feature.getEType();
				List<Entry> l = datasource.loadByQuery(new PQuery(eClass).getCriteria().equal(r.getEOpposite(), entity.getId()).getQuery());
				
				for (Entry entry : l) {
					Map<String, Object> map = entry.dataSets.get(eClass);
					PKey key = new PKey(eClass, map.get("SID"));
					PersistedEntity e = entityManager.getEntity(key);
					if (e == null) {
						e = toPersistedEntity(eClass, map);
						entityManager.setEntity(key, e);
					}
					rv.add(e);
				}
				entity.set(feature, rv);
			}
			return rv;
		}
	}

	@Override
	public int size(EStructuralFeature feature) {
		return internalGetPersistedList(feature).size();
	}
	
	private PersistedEntity toPersistedEntity(EClass eClass, Map<String, Object> data) {
		PersistedEntityImpl e = new PersistedEntityImpl(eClass, datasource);
		for (EStructuralFeature f : eClass.getEAllStructuralFeatures()) {
			if (!f.isMany()) {
				e.set(f, data.get(f.getName().toUpperCase()));
			}
		}
		return e;
	}

	@Override
	public boolean isEmpty(EStructuralFeature feature) {
		return internalGetPersistedList(feature).isEmpty();
	}

	@Override
	public boolean contains(EStructuralFeature feature, Object value) {
		InternalEObject i = (InternalEObject) value;
		PEStore store = (PEStore) i.eStore();
		PersistedEntity searchedEntity = store.getWorkingCopy().getPersistedEntity();
		
		for( PersistedEntity e : internalGetPersistedList(feature) ) {
			if( searchedEntity == e ) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int indexOf(EStructuralFeature feature, Object value) {
		InternalEObject i = (InternalEObject) value;
		PEStore store = (PEStore) i.eStore();
		PersistedEntity searchedEntity = store.getWorkingCopy().getPersistedEntity();
		
		int idx = 0;
		for( PersistedEntity e : internalGetPersistedList(feature) ) {
			if( searchedEntity == e ) {
				return idx;
			}
			idx++;
		}
		
		return -1;
	}

	@Override
	public int lastIndexOf(EStructuralFeature feature, Object value) {
		InternalEObject i = (InternalEObject) value;
		PEStore store = (PEStore) i.eStore();
		PersistedEntity searchedEntity = store.getWorkingCopy().getPersistedEntity();

		int rv = -1;
		int idx = 0;
		for( PersistedEntity e : internalGetPersistedList(feature) ) {
			if( searchedEntity == e ) {
				rv = idx;
			}
			idx++;
		}

		
		return rv;
	}

	@Override
	public void add(EStructuralFeature feature, int index, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(EStructuralFeature feature, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object move(EStructuralFeature feature, int targetIndex, int sourceIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear(EStructuralFeature feature) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] toArray(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(EStructuralFeature feature, T[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PersistedEntity getPersistedEntity() {
		return entity;
	}
	
	@Override
	public String toString() {
		return "WorkingCopy [" + entity + "]";
	}
}

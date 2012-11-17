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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.bestsolution.pemf.store.PDatasource;
import at.bestsolution.pemf.store.PDatasource.Entry;
import at.bestsolution.pemf.store.PKey;
import at.bestsolution.pemf.store.PQuery;
import at.bestsolution.pemf.store.PTransaction;
import at.bestsolution.pemf.store.impl.manager.SimpleEObjectManager;
import at.bestsolution.pemf.store.spi.EObjectManager;
import at.bestsolution.pemf.store.spi.PEStore;
import at.bestsolution.pemf.store.spi.PersistedEntity;
import at.bestsolution.pemf.store.spi.PersistedEntityManager;
import at.bestsolution.pemf.store.spi.WorkingCopyEntity;

public class TransactionImpl<T extends EObject> implements PTransaction<T> {
	private PersistedEntityManager entityManager;
	private EObjectManager<T> eObjManager;
	private PDatasource datasource;

	public TransactionImpl(PersistedEntityManager entityManager, PDatasource datasource) {
		this.entityManager = entityManager;
		this.eObjManager = new SimpleEObjectManager<T>();
		this.datasource = datasource;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <O extends T> O loadEntity(PKey key) {
		O rv = eObjManager.getEntity(key);
		if (rv == null) {
			PersistedEntity e = entityManager.getEntity(key);
			if (e == null) {
				Entry entry = datasource.loadByKey(key);
				if (entry != null) {
					Map<String, Object> data = entry.dataSets.get(key.eClass);
					e = toPersistedEntity(key.eClass, data);
					entityManager.setEntity(key, e);
				}
			}

			if (e != null) {
				WorkingCopyEntity workingCopy = e.createWorkingCopy((PTransaction<EObject>) this);
				InternalEObject eo = (InternalEObject) EcoreUtil.create(key.eClass);
				eo.eSetStore(new StoreImpl(workingCopy));
				rv = (O) eo;
				eObjManager.setEntity(key, rv);
			}
		}

		return rv;
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
	public List<T> loadAllEntities(EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <O extends T> List<O> loadEntities(PQuery query) {
		List<Entry> data = datasource.loadByQuery(query);
		List<O> rv = new ArrayList<>();
		for (Entry entry : data) {
			Map<String, Object> map = entry.dataSets.get(query.eClass);
			PKey key = new PKey(query.eClass, map.get("SID"));
			O o = eObjManager.getEntity(key);
			if (o == null) {
				PersistedEntity e = entityManager.getEntity(key);
				if (e == null) {
					e = toPersistedEntity(query.eClass, map);
					entityManager.setEntity(key, e);
				}

				WorkingCopyEntity workingCopy = e.createWorkingCopy((PTransaction<EObject>) this);
				InternalEObject eo = (InternalEObject) EcoreUtil.create(key.eClass);
				eo.eSetStore(new StoreImpl(workingCopy));
				o = (O) eo;
				eObjManager.setEntity(key, o);
			}

			rv.add(o);
		}
		return rv;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T createEntity(EClass eClass) {
		PersistedEntity entity = new PersistedEntityImpl(eClass, datasource);
		WorkingCopyEntity workingCopy = entity.createWorkingCopy((PTransaction<EObject>) this); 
		InternalEObject eo = (InternalEObject) EcoreUtil.create(eClass);
		eo.eSetStore(new StoreImpl(workingCopy));
		return (T) eo;
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	static class StoreImpl implements PEStore {
		private final WorkingCopyEntity workingCopy;

		public StoreImpl(WorkingCopyEntity workingCopy) {
			this.workingCopy = workingCopy;
		}

		@Override
		public Object get(InternalEObject object, EStructuralFeature feature, int index) {
			if (index == NO_INDEX) {
				return workingCopy.get(feature);
			} else {
				return workingCopy.get(feature, index);
			}
		}

		@Override
		public Object set(InternalEObject object, EStructuralFeature feature, int index, Object value) {
			if (index == NO_INDEX) {
				return workingCopy.set(feature, value);
			} else {
				return workingCopy.set(feature, index, value);
			}
		}

		@Override
		public boolean isSet(InternalEObject object, EStructuralFeature feature) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void unset(InternalEObject object, EStructuralFeature feature) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
			return workingCopy.isEmpty(feature);
		}

		@Override
		public int size(InternalEObject object, EStructuralFeature feature) {
			return workingCopy.size(feature);
		}

		@Override
		public boolean contains(InternalEObject object, EStructuralFeature feature, Object value) {
			return workingCopy.contains(feature, value);
		}

		@Override
		public int indexOf(InternalEObject object, EStructuralFeature feature, Object value) {
			return workingCopy.indexOf(feature, value);
		}

		@Override
		public int lastIndexOf(InternalEObject object, EStructuralFeature feature, Object value) {
			return workingCopy.lastIndexOf(feature, value);
		}

		@Override
		public void add(InternalEObject object, EStructuralFeature feature, int index, Object value) {
			workingCopy.add(feature, index, value);
		}

		@Override
		public Object remove(InternalEObject object, EStructuralFeature feature, int index) {
			return workingCopy.remove(feature, index);
		}

		@Override
		public Object move(InternalEObject object, EStructuralFeature feature, int targetIndex, int sourceIndex) {
			return workingCopy.move(feature, targetIndex, sourceIndex);
		}

		@Override
		public void clear(InternalEObject object, EStructuralFeature feature) {
			workingCopy.clear(feature);
		}

		@Override
		public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
			return workingCopy.toArray(feature);
		}

		@Override
		public <O> O[] toArray(InternalEObject object, EStructuralFeature feature, O[] array) {
			return workingCopy.toArray(feature, array);
		}

		@Override
		public int hashCode(InternalEObject object, EStructuralFeature feature) {
			return workingCopy.hashCode();
		}

		@Override
		public InternalEObject getContainer(InternalEObject object) {
			for( EReference r : object.eClass().getEAllReferences() ) {
				if( r.getEOpposite() != null && r.getEOpposite().isContainment() ) {
					InternalEObject eo = (InternalEObject) workingCopy.get(r);
					if( eo != null ) {
						return eo;
					}
				}
			}
			return null;
		}

		@Override
		public EStructuralFeature getContainingFeature(InternalEObject object) {
			for( EReference r : object.eClass().getEAllReferences() ) {
				if( r.getEOpposite() != null && r.getEOpposite().isContainment() ) {
					InternalEObject eo = (InternalEObject) workingCopy.get(r);
					if( eo != null ) {
						return r.getEOpposite();
					}
				}
			}
			return null;
		}

		@Override
		public EObject create(EClass eClass) {
			//TODO Implement
			throw new UnsupportedOperationException();
		}

		@Override
		public WorkingCopyEntity getWorkingCopy() {
			return workingCopy;
		}
	}
}
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.pemf.store.PDatasource;
import at.bestsolution.pemf.store.PTransaction;
import at.bestsolution.pemf.store.spi.PersistedEntity;
import at.bestsolution.pemf.store.spi.PersistedEntityManager;
import at.bestsolution.pemf.store.spi.WorkingCopyEntity;

public class PersistedEntityImpl implements PersistedEntity {
	private List<WorkingCopyEntity> workingCopies = new ArrayList<>();
	private Map<EStructuralFeature, Object> data = new HashMap<EStructuralFeature, Object>();
	private PersistedEntityManager manager;
	private PDatasource datasource;
	private Object id;
	private EClass eClass;
	
	public PersistedEntityImpl(EClass eClass, PDatasource datasource) {
		this.eClass = eClass;
		this.datasource = datasource;
	}

	@Override
	public EClass getEClass() {
		return eClass;
	}
	
	@Override
	public Object getId() {
		return id;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(EStructuralFeature feature) {
		return (T) data.get(feature);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T set(EStructuralFeature feature, Object o) {
		if( feature instanceof EAttribute && ((EAttribute) feature).isID() ) {
			id = o;
		}
//		if( feature instanceof EReference && ((EReference)feature).getEOpposite() != null && ((EReference)feature).getEOpposite().isContainment() && o != null) {
//			System.err.println("==========> This is the container");
//		}
		System.err.println("Setting: " + feature.getName() + " => " + o);
		return (T) data.put(feature, o);
	}

	@Override
	public WorkingCopyEntity createWorkingCopy(PTransaction<EObject> transaction) {
		WorkingCopyEntityImpl impl = new WorkingCopyEntityImpl(this,  transaction, manager, datasource);
		workingCopies.add(impl);
		return impl;
	}

	@Override
	public void setManager(PersistedEntityManager manager) {
		this.manager = manager;
	}
	
	@Override
	public String toString() {
		return "PersistedEntity[type="+eClass.getName()+", id="+id+"]";
	}
}
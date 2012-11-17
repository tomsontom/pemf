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
package at.bestsolution.pemf.store.spi;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.pemf.store.PTransaction;



public interface PersistedEntity {
	public Object getId();
	public EClass getEClass();
	public <T> T get(EStructuralFeature feature);
	public <T> T set(EStructuralFeature feature, Object o);
	public WorkingCopyEntity createWorkingCopy(PTransaction<EObject> transaction);
	public void setManager(PersistedEntityManager manager);
}

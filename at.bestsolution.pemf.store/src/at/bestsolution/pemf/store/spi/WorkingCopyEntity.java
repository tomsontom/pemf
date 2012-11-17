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

import org.eclipse.emf.ecore.EStructuralFeature;

public interface WorkingCopyEntity {
//	public EObject getOwner();
//	public EStructuralFeature getContainingFeature();

	public PersistedEntity getPersistedEntity();
	public Object get(EStructuralFeature feature);
	public Object set(EStructuralFeature feature, Object value);
	
	public Object get(EStructuralFeature feature, int index);
	public Object set(EStructuralFeature feature, int index, Object value);
	public int size(EStructuralFeature feature);
	public boolean isEmpty(EStructuralFeature feature);
	public boolean contains(EStructuralFeature feature, Object value);
	public int indexOf(EStructuralFeature feature, Object value);
	public int lastIndexOf(EStructuralFeature feature, Object value);
	public void add(EStructuralFeature feature, int index, Object value);
	public Object remove(EStructuralFeature feature, int index);
	public Object move(EStructuralFeature feature, int targetIndex, int sourceIndex);
	public void clear(EStructuralFeature feature);
	public Object[] toArray(EStructuralFeature feature);
	public <T> T[] toArray(EStructuralFeature feature, T[] array);
	public int hashCode(EStructuralFeature feature);
	
}

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
package at.bestsolution.pemf.store;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface PTransaction<T extends EObject> {
	public <O extends T> O loadEntity(PKey key);
	public <O extends T> List<O> loadAllEntities(EClass eClass);
	public <O extends T> List<O> loadEntities(PQuery query);
	public <O extends T> O createEntity(EClass eClass);
	public void commit();
	public void rollback();
	public void dispose();
}

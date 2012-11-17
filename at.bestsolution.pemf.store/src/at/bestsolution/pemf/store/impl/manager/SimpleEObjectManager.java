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
package at.bestsolution.pemf.store.impl.manager;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.pemf.store.PKey;
import at.bestsolution.pemf.store.spi.EObjectManager;

public class SimpleEObjectManager<T extends EObject> implements EObjectManager<T> {
	private Map<PKey, T> entities = new HashMap<PKey, T>();

	@Override
	public T getEntity(PKey key) {
		return entities.get(key);
	}
	
	@Override
	public void setEntity(PKey key, T entity) {
		entities.put(key, entity);
	}
}

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

import at.bestsolution.pemf.store.PKey;
import at.bestsolution.pemf.store.spi.PersistedEntity;
import at.bestsolution.pemf.store.spi.PersistedEntityManager;

public class SimplePersistedEntityManager implements PersistedEntityManager {
	private Map<PKey,PersistedEntity> entityMap = new HashMap<>();
	
	@Override
	public PersistedEntity getEntity(PKey key) {
		return entityMap.get(key);
	}

	@Override
	public void setEntity(PKey key, PersistedEntity entity) {
		entity.setManager(this);
		entityMap.put(key, entity);
	}
	
}

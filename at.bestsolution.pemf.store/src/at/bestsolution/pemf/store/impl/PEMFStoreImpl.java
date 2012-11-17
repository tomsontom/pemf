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

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.pemf.store.PEntityStore;
import at.bestsolution.pemf.store.PDatasource;
import at.bestsolution.pemf.store.PTransaction;
import at.bestsolution.pemf.store.impl.manager.SimplePersistedEntityManager;
import at.bestsolution.pemf.store.spi.PersistedEntityManager;

public class PEMFStoreImpl<T extends EObject> implements PEntityStore<T> {
	private PersistedEntityManager entityManager;
	private PDatasource datasource;
	
	public PEMFStoreImpl() {
		this.entityManager = new SimplePersistedEntityManager();
	}
	
	public void setPersistentDatasource(PDatasource datasource) {
		this.datasource = datasource;
	}
	
	public void unsetPersistentDatasource(PDatasource datasource) {
		this.datasource = null;
	}
	
	@Override
	public PTransaction<T> openTransaction() {
		return new TransactionImpl<T>(entityManager, datasource);
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
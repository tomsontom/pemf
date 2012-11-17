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
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

public interface PDatasource {
	public static class Entry {
		public final Map<EClass, Map<String, Object>> dataSets;
		
		public Entry(Map<EClass, Map<String, Object>> dataSets) {
			this.dataSets = dataSets;
		}
	}
	
	public Entry loadByKey(PKey key);
	public List<Entry> loadByKeys(PKey... keys);
	public List<Entry> loadAll(EClass eClass);
	public List<Entry> loadByQuery(PQuery query);
}

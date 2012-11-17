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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class PQuery {
	public final EClass eClass;
	private Criteria criteria;
	
	public PQuery(EClass eClass) {
		this.eClass = eClass;
	}
	
	public boolean hasCriteria() {
		return criteria != null;
	}
	
	public Criteria getCriteria() {
		if( criteria == null ) {
			criteria = new Criteria();
		}
		return criteria;
	}
	
	public class Criteria {
		private List<Condition> whereCondition = new ArrayList<>();

		public Criteria equal(EStructuralFeature feature, Object value) {
			whereCondition.add(new Equal(feature, value));
			return this;
		}
		
		public List<Condition> getWhereCondition() {
			return Collections.unmodifiableList(whereCondition);
		}
		
		public PQuery getQuery() {
			return PQuery.this;
		}
	}
	
	public static abstract class Condition {
		public final EStructuralFeature feature;
		
		public Condition(EStructuralFeature feature) {
			this.feature = feature;
		}
	}
	
	public static class Equal extends Condition {
		
		public final Object value;
		
		public Equal(EStructuralFeature feature, Object value) {
			super(feature);
			this.value = value;
		}
	}
}

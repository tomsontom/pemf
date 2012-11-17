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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.eclipse.emf.ecore.EClass;

import at.bestsolution.pemf.store.PQuery.Condition;
import at.bestsolution.pemf.store.PQuery.Equal;

public abstract class PSQLDatasource implements PDatasource {
	private DataSource datasource;

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public Entry loadByKey(PKey key) {
		try {
			Connection c = datasource.getConnection();
			PreparedStatement stmt = c.prepareStatement("SELECT * FROM " + key.eClass.getName() + " WHERE SID = ?");
			stmt.setObject(1, key.id);
			ResultSet set = stmt.executeQuery();

			if (set.next()) {
				HashMap<EClass, Map<String, Object>> map = new HashMap<>();
				HashMap<String, Object> rowData = new HashMap<>();
				map.put(key.eClass, rowData);

				int count = set.getMetaData().getColumnCount();
				for (int i = 1; i <= count; i++) {
					rowData.put(set.getMetaData().getColumnName(i), set.getObject(i));
				}

				return new Entry(map);
			}

			set.close();
			stmt.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Entry> loadByKeys(PKey... keys) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entry> loadAll(EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entry> loadByQuery(PQuery query) {
		try {
			Connection c = datasource.getConnection();
			StringBuilder b = new StringBuilder("SELECT * FROM " + query.eClass.getName());
			List<Object> paramValues = new ArrayList<>();
			
			if (query.hasCriteria()) {
				b.append(" WHERE ");
				boolean flag = false;
				for (Condition cond : query.getCriteria().getWhereCondition()) {
					if (flag) {
						b.append(" AND ");
					}

					if (cond instanceof Equal) {
						b.append(cond.feature.getName().toUpperCase() + " = ?");
						paramValues.add(((Equal) cond).value);
					} else {
						throw new IllegalStateException("Unsupported condition '"+cond+"'");
					}

					flag = true;
				}
			}
			System.err.println("QUERY: " + b + " => " + paramValues);
			PreparedStatement stmt = c.prepareStatement(b.toString());
			for( int i = 1; i <= paramValues.size(); i++  ) {
				stmt.setObject(i, paramValues.get(i-1));
			}
			
			ResultSet set = stmt.executeQuery();
			
			List<Entry> rv = new ArrayList<>();
			while( set.next() ) {
				HashMap<EClass, Map<String, Object>> map = new HashMap<>();
				HashMap<String, Object> rowData = new HashMap<>();
				map.put(query.eClass, rowData);

				int count = set.getMetaData().getColumnCount();
				for (int i = 1; i <= count; i++) {
					rowData.put(set.getMetaData().getColumnName(i), set.getObject(i));
				}

				rv.add(new Entry(map));
			}
			
			stmt.close();
			c.close();
			return rv;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

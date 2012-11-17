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
package at.bestsolution.pemf.store.test.app;

import org.h2.jdbcx.JdbcDataSource;

import at.bestsolution.pemf.store.PSQLDatasource;

public class H2Datasource extends PSQLDatasource {

	public H2Datasource() {
		JdbcDataSource datasource = new JdbcDataSource();
		datasource.setURL("jdbc:h2:/Users/tomschindl/Documents/e4_workspaces/efxclipse/at.bestsolution.pemf.store.test.app/database");
		datasource.setUser("sa");
		setDatasource(datasource);
	}

}

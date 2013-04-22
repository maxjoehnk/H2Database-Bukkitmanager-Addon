package org.efreak.bukkitmanager.addon.h2;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.efreak.bukkitmanager.Database;

public class H2 extends Database {

	@Override
	protected void connect() throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		dbConn = DriverManager.getConnection("jdbc:h2://");

	}

	@Override
	protected void config() {

	}

}

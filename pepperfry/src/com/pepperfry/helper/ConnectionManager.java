package com.pepperfry.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		Properties props = null;
		Connection con = null;

		props = new Properties();
		props.load(ConnectionManager.class.getClassLoader().getResourceAsStream("db.properties"));

		Class.forName(props.getProperty("driverClassname"));
		con = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"),
				props.getProperty("password"));

		return con;
	}
}













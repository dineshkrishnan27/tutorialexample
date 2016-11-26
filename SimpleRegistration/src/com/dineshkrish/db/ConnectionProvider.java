package com.dineshkrish.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class ConnectionProvider {

	private static Connection connection;

	public static Connection getConnection() {

		try {

			// Loading Driver Class
			Class.forName("com.mysql.jdbc.Driver");

			// Getting the Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return connection;
	}

}

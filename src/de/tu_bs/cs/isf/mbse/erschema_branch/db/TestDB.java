package de.tu_bs.cs.isf.mbse.erschema_branch.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class TestDB {

	private final static TestDB INSTANCE = new TestDB();
	private final static String URL = "jdbc:h2:mem:test";	
	private Connection conn;

	private TestDB() {
		try {
			conn = DriverManager.getConnection(URL);
		} catch (SQLException ignore) {			
		}
	}

	public static void query(final String sql) {
		try {
			Statement st = INSTANCE.conn.createStatement();
			st.execute(sql);
			System.out.println("'" + sql + "' executed!");
		} catch (SQLException e) {
			System.err.println("Couldn't execute '" + sql + "'");
			System.err.println(e.getMessage());
		}		
	}

	public static void main(String[] args) {
		final String query = "create table foo";
		query(query);
	}
}

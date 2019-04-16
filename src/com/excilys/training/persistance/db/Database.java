package com.excilys.training.persistance.db;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class Database {
	
	public abstract void loadDriver();
	protected String jdbcUrl ;
	protected String dbUsername, dbPassword;
	
	public Database() {
		this.loadDriver();
	}
	public void setConnectionParams(String username, String password) {
		this.dbUsername = username;
		this.dbPassword = password;
	}
	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcUrl,dbUsername,dbPassword);
		}catch(Exception exp) {
			System.err.println("Database encountered a problem");
			System.err.println("Exception" + exp.getMessage());
		}
		return connection;
	}	

}

package com.excilys.training.persistance.db;


public class Mysql extends Database{
	
	public Mysql() {
		super();
		this.jdbcUrl =  "jdbc:mysql://localhost/computer-database-db";
	}

	@Override
	public void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException exp) {
			//log the bloody exception
			System.err.println("Unable to load Mysql Driver");			
		}
	}
	
}

package com.excilys.training.persistance;

import com.excilys.training.model.Computer;
import java.util.Set;
import com.excilys.training.persistance.db.Database;
import java.sql.Connection;
import java.sql.SQLException;

public class ComputerPersistor implements Persistor<Computer> {
	
	private final Database database;
	public ComputerPersistor(Database database) {
		this.database = database;
	}

	@Override
	public Set<Computer> listAllQuery() {
		try(Connection connection = database.getConnection()){
			String query =  "SELECT id, name FROM computer";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public void createQuery(Computer computer) throws Exception {
		if(computer==null || computer.getId()<1) {
			throw new Exception("The computer model not suited for building SQL query");
		}
		String query = "INSERT INTO `computer-database-db`.`computer`"
				+ " (`id`,`name`,`introduced`,`discontinued`,`company_id`) VALUES (?,?,?,?,?)";
		
		
	}
	@Override
	public void deleteQuery(Long id) {
	}
	@Override
	public  void updateQuery(Computer compputer) {
	}
	@Override
	public Computer findOneQuery(Long id) {
		return null;
	}
	@Override
	public void setDatabase(Database database) {
		
	}
}

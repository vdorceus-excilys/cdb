package com.excilys.training.service;

import static java.lang.System.out;

import java.util.Set;

import com.excilys.training.model.Computer;
import com.excilys.training.model.validator.Validator;
import com.excilys.training.persistance.ComputerPersistor;
import com.excilys.training.persistance.Persistor;
import com.excilys.training.persistance.db.Database;
import com.excilys.training.persistance.db.Mysql;
import com.excilys.training.util.ConfigurationProperties;

public class ComputerService implements Service<Computer>{
	
	private  ComputerService() {
		try {
			ConfigurationProperties config = new ConfigurationProperties();
		config.load(ConfigurationProperties.DEFAULT_PERSISTANCE_PATH);
		for (String prop : config.getAllProperties().values()) {
			out.println(prop);
		}
		Database db = new Mysql(config);
		this.persistor = new ComputerPersistor(db);
		}
		catch(Exception exp) {
			//log service exception
		}
		
	}
	
	private  static  ComputerService self=null;
	private Validator<Computer> computerValidator;
	private Persistor<Computer> persistor;
	
	public static ComputerService getInstance() {
		return (self!=null)? self : (self=new ComputerService());
	}
	@Override
	public void setValidator(Validator<Computer> computerValidator) {
		this.computerValidator = computerValidator;
	}
	@Override
	public Boolean validate (Computer computer) {
		return this.computerValidator.validate(computer);
	}
	@Override
	public Set<Computer> listAll(){
		Set<Computer> computers =null;
		try {
			computers = persistor.findAllQuery();
		}catch(Exception exp) {
			//log exception
		}
		return computers;		 
	}
	@Override
	public Computer findOne(Long id) {
		Computer computer = null;
		try {
			computer = persistor.findOneQuery(id);
		}catch(Exception  exp) {
			//log exception
		}
		return  computer;
	}
	@Override 
	public Boolean create(Computer computer) {
		Boolean state =  true;
		try {
			persistor.createQuery(computer);
		}
		catch(Exception exp) {
			state=false;
		}
		return state;
	}
	@Override 
	public Boolean update(Computer computer) {
		Boolean state = true;
		try {
			persistor.updateQuery(computer);
		}catch(Exception exp) {
			//log exception
			state = false;
		}
		return state;
	}
	@Override
	public Boolean delete(Computer computer) {
		Boolean state = true;
		try {
			persistor.deleteQuery(computer);
		}catch(Exception exp) {
			//log exception
			state = false;
		}
		return state;
	}
	@Override
	public Computer findByAttribut(String att, String value) {
		return null;
	}
	
	

}

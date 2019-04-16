package com.excilys.training.service;

import java.util.TreeSet;

import com.excilys.training.model.Computer;
import com.excilys.training.model.validator.Validator;

public class ComputerService implements Service<Computer>{
	
	private  ComputerService() {}
	
	private  static  ComputerService self=null;
	private Validator<Computer> computerValidator;
	
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
	public TreeSet<Computer> listAll(){return null;}
	@Override
	public Computer findOne(Long id) {return  null;}
	@Override 
	public Boolean create(Computer computer) {return true;}
	@Override 
	public Boolean update(Computer computer) {return true;}
	@Override
	public Boolean delete(Computer computer) {return true;}
	@Override
	public Computer findByAttribut(String att, String value) {
		return null;
	}
	
	

}

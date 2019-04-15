package com.excilys.training.service;



public class ComputerService {
	
	private  ComputerService() {}
	
	private  static  ComputerService self=null;
	
	public static ComputerService getInstance() {
		return (self!=null)? self : (self=new ComputerService());
	}
	

}

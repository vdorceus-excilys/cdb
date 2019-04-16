package com.excilys.training.service;

import java.util.TreeSet;

import com.excilys.training.model.Company;
import com.excilys.training.model.validator.Validator;


public class CompanyService implements Service<Company> {
	
	private static CompanyService self=null;
	private Validator<Company> companyValidator;
	
	private CompanyService() {
	}		
	
	public static CompanyService getInstance() {
		return (self!=null) ? self  : (self=new CompanyService());
	}
	
	@Override
	public void setValidator(Validator<Company> companyValidator) {
		this.companyValidator = companyValidator;
	}
	@Override
	public Boolean validate (Company company) {
		return this.companyValidator.validate(company);
	}
	@Override
	public TreeSet<Company> listAll(){return null;}
	@Override
	public Company findOne(Long id) {return  null;}
	@Override 
	public Boolean create(Company company) {return true;}
	@Override 
	public Boolean update(Company company) {return true;}
	@Override
	public Boolean delete(Company company) {return true;}
	@Override 
	public Company findByAttribut(String att, String value) {
		if(att!="NAME")
			return null;
		//find it 
		return null;
	}
	
	
	
}

package com.excilys.training.ui;

import com.excilys.training.controller.CompanyController;
import com.excilys.training.controller.Controller;
import com.excilys.training.mapper.DefaultCompanyMapper;
import com.excilys.training.mapper.dto.DataTransferObject;
import com.excilys.training.model.Company;

public class CompanyView implements View<Company> {
	private final Controller<Company> companyController;
	
	public CompanyView() {
		companyController = new CompanyController(new DefaultCompanyMapper());
	}
	
	@Override
	public void menu() {
		
	}
	
	@Override
	public void show() {
		
	}
	
	@Override
	public void list() {
		
	}


	@Override
	public DataTransferObject<Company> create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataTransferObject<Company> update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByAttribut() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.excilys.training.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.excilys.training.mapper.dto.DefaultComputerSkin;
import com.excilys.training.model.Company;
import com.excilys.training.model.Computer;
import com.excilys.training.service.CompanyService;
import com.excilys.training.service.Service;

public class DefaultComputerMapper implements Mapper<Computer,DefaultComputerSkin> {
	
	private SimpleDateFormat sdf;
	private Service<Company> companyService;
	
	public DefaultComputerMapper() {		
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		this.companyService  = CompanyService.getInstance();
	}

	@Override
	public Computer forward(DefaultComputerSkin pojo) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		computer.setId(Long.parseLong(pojo.getId()));
		computer.setName(pojo.getName());	
		try {
			computer.setIntroduced(sdf.parse(pojo.getIntroduced()));
			computer.setDiscontinued(sdf.parse(pojo.getDiscontinued()));
		}catch(ParseException exp) {
			System.err.println(exp.getMessage());
		}
		computer.setCompany(companyService.findByAttribut("NAME",pojo.getCompany()));		
		return computer;
	}

	@Override
	public DefaultComputerSkin reverse(Computer pojo) {
		// TODO Auto-generated method stub
		DefaultComputerSkin skin =  new DefaultComputerSkin();
		skin.setId(pojo.getId().toString());
		skin.setName(pojo.getName());
		skin.setIntroduced(sdf.format(pojo.getIntroduced()));
		skin.setDiscontinued(sdf.format(pojo.getDiscontinued()));
		skin.setCompany(pojo.getCompany().getName());
		return skin;
	}

}

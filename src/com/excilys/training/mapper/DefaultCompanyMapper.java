package com.excilys.training.mapper;

import com.excilys.training.mapper.dto.DefaultCompanySkin;
import com.excilys.training.model.Company;

public class DefaultCompanyMapper implements Mapper<Company,DefaultCompanySkin> {

	@Override
	public Company forward(DefaultCompanySkin pojo) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.setId(Long.parseLong(pojo.getId()));
		company.setName(pojo.getName());
		return  company;
	}

	@Override
	public DefaultCompanySkin reverse(Company pojo) {
		// TODO Auto-generated method stub
		DefaultCompanySkin skin = new DefaultCompanySkin();
		skin.setId(pojo.getId().toString());
		skin.setName(pojo.getName());
		return null;
	}

}

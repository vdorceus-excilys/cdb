package com.excilys.training.model.validator;

import com.excilys.training.model.Company;

public class CompanyDefaultValidator implements Validator<Company>{
	
	public Boolean validate(Company company) {
		Boolean valid = (company!=null)	&& (company.getId()>=0)	;
		return valid;
	}
}

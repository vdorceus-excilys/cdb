package com.excilys.training.mapper.dto;

import com.excilys.training.model.Company;

public class DefaultCompanySkin implements DataTransferObject<Company> {
	private String id, name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

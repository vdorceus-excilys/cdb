package com.excilys.training.service;

import java.util.Set;

import com.excilys.training.model.validator.Validator;

public interface Service <T> {
	
	void setValidator(Validator<T> validator);
	Boolean validate(T model);
	
	Set<T> listAll();
	T findOne(Long id);
	T findByAttribut(String att, String value);
	Boolean create(T model);
	Boolean update(T model);
	Boolean delete(T model);
	
	
}

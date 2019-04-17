package com.excilys.training.service;

import java.util.Set;

import com.excilys.training.model.validator.Validator;
import com.excilys.training.persistance.Persistor;

public abstract class GenericService<T> implements Service<T> {
	protected Validator<T> validator;
	protected Persistor<T> persistor;
	
	// Singleton Pattern to be implemented in child classes	
	
	@Override
	public void setValidator(Validator<T> validator) {
		this.validator = validator;
	}
	@Override
	public Boolean validate (T model) {
		return this.validator.validate(model);
	}
	@Override
	public Set<T> listAll(){
		Set<T> models =null;
		try {
			models = persistor.findAllQuery();
		}catch(Exception exp) {
			//log exception
		}
		return models;
	}
	@Override
	public T findOne(Long id) {
		T model = null;
		try {
			model = persistor.findOneQuery(id);
		}catch(Exception  exp) {
			//log exception
		}
		return model;
	}
	@Override 
	public Boolean create(T model) {
		Boolean state =  true;
		try {
			persistor.createQuery(model);
		}
		catch(Exception exp) {
			state=false;
		}
		return state;		
	}
	@Override 
	public Boolean update(T model) {
		Boolean state = true;
		try {
			persistor.updateQuery(model);
		}catch(Exception exp) {
			//log exception
			state = false;
		}
		return state;		
	}
	@Override
	public Boolean delete(T model) {
		Boolean state = true;
		try {
			persistor.deleteQuery(model);
		}catch(Exception exp) {
			//log exception
			state = false;
		}
		return state;
	}
	
	@Override 
	public T findByAttribut(String att, String value) {
		if(att!="NAME")
			return null;
		//find it 
		return null;
	}
}

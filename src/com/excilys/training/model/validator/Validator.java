package com.excilys.training.model.validator;

import java.text.SimpleDateFormat;

public interface Validator <T> {
	Boolean validate(T model) ;

	public static  SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
	
}

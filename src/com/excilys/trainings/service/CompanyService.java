package com.excilys.trainings.service;

import com.excilys.training.model.Computer;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;


public class CompanyService {
	
	private static CompanyService self=null;
	private static SimpleDateFormat sdf;
	private static Date MINIMUM_DATE_LIMIT; //could be final but who cares
	private static Date MAXIMUM_DATE_LIMIT; // could be final but who cares again !

	private CompanyService() {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			MINIMUM_DATE_LIMIT= sdf.parse("01-01-1970");
		}catch(ParseException parseException) {
			//log the bloody exception Valjery...
		}
		MAXIMUM_DATE_LIMIT = new Date(); //it will be initialized with today Date
	}
		
	
	public static CompanyService getInstance() {
		return (self!=null) ? self  : (self=new CompanyService());
	}
	
	private Boolean validate(Computer computer) {
		Boolean valid = (computer!=null)
				&& (computer.getId()>0)
				&& (computer.getName().length()>2)
				&& (computer.getIntroduced()==null || (
						computer.getIntroduced().compareTo(MINIMUM_DATE_LIMIT)<0 &&
						computer.getIntroduced().compareTo(MAXIMUM_DATE_LIMIT)>0)
					)
				&& (computer.getDiscontinued()==null || computer.getIntroduced()!=null &&(
						computer.getDiscontinued().compareTo(computer.getIntroduced())<0 &&
						computer.getDiscontinued().compareTo(MAXIMUM_DATE_LIMIT)>0)
					)
				;		
		return valid;
	}
}

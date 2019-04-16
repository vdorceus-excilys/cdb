package com.excilys.training.model.validator;

import java.text.ParseException;
import java.util.Date;

import com.excilys.training.model.Computer;


public class ComputerDefaultValidator implements Validator<Computer> {
	private static Date MINIMUM_DATE_LIMIT=null;
	private static Date MAXIMUM_DATE_LIMIT=null;
	
	static {
		try{
			MINIMUM_DATE_LIMIT = SDF.parse("01-01-1970");
		}catch(ParseException exp) {
			//log the bloddy thing
		}finally {
			MAXIMUM_DATE_LIMIT = new Date();
		}
	}
	
	public Boolean validate(Computer computer) {		
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

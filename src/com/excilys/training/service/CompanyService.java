package com.excilys.training.service;


import static java.lang.System.out;

import com.excilys.training.model.Company;
import com.excilys.training.persistance.CompanyPersistor;
import com.excilys.training.persistance.db.Database;
import com.excilys.training.persistance.db.Mysql;
import com.excilys.training.util.ConfigurationProperties;


public class CompanyService extends GenericService<Company>{
	
	static private CompanyService self=null;
	
	private CompanyService() {
		super();
		try {
			ConfigurationProperties config = new ConfigurationProperties();
		config.load(ConfigurationProperties.DEFAULT_PERSISTANCE_PATH);
		for (String prop : config.getAllProperties().values()) {
			out.println(prop);
		}
		Database db = new Mysql(config);
		this.persistor = new CompanyPersistor(db);
		}
		catch(Exception exp) {
			//log service exception
		}
	}
	
	public static CompanyService getInstance() {
		return (self!=null)? self : (self=new CompanyService());
	}
	
	
}

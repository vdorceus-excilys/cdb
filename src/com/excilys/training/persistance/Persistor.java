package com.excilys.training.persistance;
import com.excilys.training.persistance.db.Database;
import java.util.Set;

public interface Persistor<T> {
	
	Set<T> listAllQuery();
	void createQuery(T model) throws Exception;
	void deleteQuery(Long id) throws Exception;
	void updateQuery(T model) throws Exception;
	T findOneQuery(Long id) throws Exception;
	void setDatabase(Database database);

}

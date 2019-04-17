package com.excilys.training.persistance;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public interface Persistor<T> {
	
	Set<T> findAllQuery() throws Exception;
	void createQuery(T model) throws Exception;
	void deleteQuery(T model) throws Exception;
	void updateQuery(T model) throws Exception;
	T findOneQuery(Long id) throws Exception;
	T convertResultLine(ResultSet s) throws SQLException;
	void setLazyStrategy(Boolean b);

}

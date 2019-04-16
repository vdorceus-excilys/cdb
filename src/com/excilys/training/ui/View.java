package com.excilys.training.ui;
import com.excilys.training.mapper.dto.DataTransferObject;
import java.io.IOException;

public interface View<T>{
	public void menu() throws IOException;
	public void show(DataTransferObject<T> dto);
	public DataTransferObject<T> create();
	public DataTransferObject<T> update();
	public String delete();
	public String findOne();
	public String findByAttribut();
	
}

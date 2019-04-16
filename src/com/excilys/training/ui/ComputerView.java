package com.excilys.training.ui;

import com.excilys.training.mapper.dto.DataTransferObject;
import com.excilys.training.model.Computer;
import java.io.IOException;

public class ComputerView implements View<Computer>{
	
	
	@Override 
	public void menu() throws IOException{
		StringBuffer q = new StringBuffer();
		q.append("Tapez  [1] pour lister les ordinateurs\n");
		q.append("Tapez  [2] pour ajouter un ordinateur\n");
		q.append("Tapez  [3] pour supprimer un ordinateur\n");
		q.append("Tapez  [4] pour voir les détails d'un ordinateur\n");
		q.append("Tapez  [q] pour quitter le programme");
		System.out.println(q);
		String s = Launcher.read();
	}

	@Override
	public void show(DataTransferObject<Computer> dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataTransferObject<Computer> create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataTransferObject<Computer> update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByAttribut() {
		// TODO Auto-generated method stub
		return null;
	}

}

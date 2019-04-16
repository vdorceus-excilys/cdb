package com.excilys.training.ui;

import java.io.IOException;
import java.util.Set;

import com.excilys.training.mapper.dto.DataTransferObject;
import com.excilys.training.model.Computer;

public class ComputerView implements View<Computer>{
	
	
	@Override 
	public void menu() throws IOException{
		StringBuffer q = new StringBuffer();
		System.out.println("Ordinateurs: ");
		q.append("Tapez  [1] pour lister\n");
		q.append("Tapez  [2] pour ajouter un nouveau\n");
		q.append("Tapez  [3] pour supprimer un ordinateur\n");
		q.append("Tapez  [4] pour voir les détails d'un ordinateur\n");
		q.append("Tapez  [q] pour quitter le contexte actuel\n");
		System.out.println(q);
		String command = Launcher.read();
		while(!command.equals("q")) {
			switch(command) {
			case "1" : 
				this.list(); break;
			case "2" : 
				this.create(); break;
			case "3" : 
				this.delete(); break;
			case "4" : 
				this.show(); break;
			default:
					System.out.println("Commande non reconnue");
			}
			command = Launcher.read();
		}
	}
	
	@Override
	public void list() {

		System.out.println("listing all");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

		System.out.println("showing one");
	}

	@Override
	public DataTransferObject<Computer> create() {
		// TODO Auto-generated method stub
		System.out.println("creating one");
		return null;
	}

	@Override
	public DataTransferObject<Computer> update() {
		// TODO Auto-generated method stub
		System.out.println("updating");
		return null;
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		System.out.println("deleting...");
		return null;
	}

	@Override
	public String findOne() {
		// TODO Auto-generated method stub
		System.out.println("finding one");
		return null;
	}

	@Override
	public String findByAttribut() {
		// TODO Auto-generated method stub
		System.out.println("finding by attribut");
		return null;
	}

}

package com.excilys.training.ui;
import static java.lang.System.in;
import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.excilys.training.model.Company;
import com.excilys.training.model.Computer;

public class Launcher {
	
	private static View<Company> companyView;
	private static View<Computer> computerView;
	
	static  {
		companyView = new CompanyView();
		computerView = new ComputerView();
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		out.println("Bienvenue sur le gestionnaire de parc informatique");
		StringBuffer q = new StringBuffer();
		q.append("Tapez  [O] pour entrer dans le contexte Ordinateur\n");
		q.append("Tapez  [F] pour entrer dans le contexte fabriquant\n");
		q.append("Tapez  [q] pour quitter le programme");
		String input = "";
		out.println(q);
		input = read();
		while(!input.equals("q")) {
			if(input.equals("O")) {
				//Computer context
				out.println("Vous êtes dans le contexte Ordinateur");
				computerView.menu();				
			}else if(input.equals("F")) {
				//Company context
				out.println("Vous êtes dans le contexte Fabriquant");
				companyView.menu();
			}
			else {
				out.println("Commande non reconnue...");
				out.println("Saisissez une commande reconnue...");
				input=read();
			}
		}
			

	}
	
	public static String read() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		return reader.readLine();
	}
	
	

}

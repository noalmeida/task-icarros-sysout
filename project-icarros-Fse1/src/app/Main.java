package app;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) throws IOException {
		
		
		

		Menu menu = new Menu();
		Cases cases = new Cases();
        

		String opcao = "";
		
		
	
		
		  do

          {
			  menu.callMenu();
			  Scanner leitor = new Scanner(System.in);
			  opcao = leitor.nextLine();
			 
				cases.callCase(opcao);
			

         

      } while (!opcao.equals("0"));
		  System.out.println("Saindo...");

	}

}

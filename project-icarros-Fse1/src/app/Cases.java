package app;

import Impl.Cadastrar;

public class Cases {
	Cadastrar cadastrar = new Cadastrar();
	
	public void callCase (String opcaoRecieve) {
		
		switch(opcaoRecieve) {
		case "1": 
			System.out.println("Cadastrar cliente");
			cadastrar.callCadastrar();
			
			break;
		case "2": 
			System.out.println("Listar cliente");
			break;
		case "3": 
			System.out.println("Gravar Dados");
			break;
		case "4": 
			System.out.println("Consultar Arquivo");
			break;
		
		}
		
		
			
		
	}

}

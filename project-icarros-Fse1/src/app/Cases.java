package app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import Impl.Methods;


public class Cases {
	Methods methods = new Methods();

	public void callCase (String opcaoRecieve) throws IOException {
		
		switch(opcaoRecieve) {
		case "1": 
			System.out.println("Cadastrar cliente");
			methods.callCadastrar();
			
			break;
		case "2": 
			System.out.println("Listar cliente");
			methods.callListClient();
			
			break;
		case "3": 
			System.out.println("Gravar Dados");
			methods.callGravarDados();
			break;
		case "4": 
			System.out.println("Consultar Arquivo");
			methods.callConsultaArquivo();
			break;
		
		}
		
		
			
		
	}

}

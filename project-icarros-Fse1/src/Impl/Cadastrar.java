package Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.Conta;
import validacoes.Validacoes;

public class Cadastrar extends Validacoes {
	
	public void callCadastrar() {
		Scanner leitor = new Scanner(System.in);
		List<Cliente> client = new ArrayList<>();
		List<Conta> conta = new ArrayList<>();
		Cliente clientAtrib = new Cliente();
		Conta clientCont = new Conta();
		
		
		System.out.println("Qual seu nome:");
		clientAtrib.nome= leitor.nextLine();
		System.out.println("Qual seu Telefone:");
		clientAtrib.telefone = leitor.nextLine();
		System.out.println("Qual seu email");
		String emailRec= clientAtrib.email = leitor.nextLine();
		while (!isValidEmail(emailRec)) {
			System.out.println("Por favor. Digite um email válido;");
			emailRec= clientAtrib.email = leitor.nextLine();
			}
		
		clientAtrib.email=emailRec;
		
		client.add(clientAtrib);
		
		System.out.println("Qual numero da sua agência:");
		String agRc = clientCont.ag= leitor.nextLine();
		while (!isValidAgencia(agRc)) {
			System.out.println("Por favor. Digite apenas numeros;");
			agRc= clientCont.ag = leitor.nextLine();
			}
		
		System.out.println("Qual numero da sua conta:");
		String clientContaRecv = clientCont.conta = leitor.nextLine();
		
		while (!isValidConta(clientCont.conta)) {
			System.out.println("Por favor. Verifique o numero da conta");
			 clientContaRecv= clientCont.conta = leitor.nextLine();
			}
		System.out.println("Qual é o seu saldo:");
		clientCont.saldo = Double.valueOf(leitor.nextLine());
			conta.add(clientCont);
		
		
		
		
		
		
	}

}

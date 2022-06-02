package Impl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.Cliente;
import model.Conta;
import validacoes.Validacoes;

public class Methods extends Validacoes {

	List<Cliente> client = new ArrayList<>();
	List<Conta> conta = new ArrayList<>();

	public void callCadastrar() {
		Scanner leitor = new Scanner(System.in);
	
		Cliente clientAtrib = new Cliente();
		Conta clientCont = new Conta();

		System.out.println("Qual seu nome:");
		clientAtrib.nome = leitor.nextLine();
		System.out.println("Qual seu Telefone:");

		String tellReciv = clientAtrib.telefone = leitor.nextLine();
		while (!isValidTel(tellReciv)) {
			System.out.println("Por favor. Digite um telefone Válido!");
			tellReciv = clientAtrib.telefone = leitor.nextLine();
		}
		System.out.println("Qual seu email");
		String emailRec = clientAtrib.email = leitor.nextLine();
		while (!isValidEmail(emailRec)) {
			System.out.println("Por favor. Digite um email válido;");
			emailRec = clientAtrib.email = leitor.nextLine();
		}

		clientAtrib.email = emailRec;
        //adicionando a instancia de clientes e seus atributos capturados
		client.add(clientAtrib);

		System.out.println("Qual numero da sua agência:");
		String agRc = clientCont.ag = leitor.nextLine();
		while (!isValidAgencia(agRc)) {
			System.out.println("Por favor. Digite apenas numeros;");
			agRc = clientCont.ag = leitor.nextLine();
		}

		System.out.println("Qual numero da sua conta:");
		String clientContaRecv = clientCont.conta = leitor.nextLine();

		while (!isValidConta(clientCont.conta)) {
			System.out.println("Por favor. Verifique o numero da conta");
			clientContaRecv = clientCont.conta = leitor.nextLine();
		}
		
		System.out.println("Qual é o seu saldo:");
		double clientContaRecive = clientCont.saldo = leitor.nextFloat();
		while (!isValidSaldo(clientContaRecive)) {
			System.out.println("Por favor, digite um saldo válido");
			clientContaRecive = clientCont.saldo = leitor.nextFloat();
		}
		
	
		 //adicionando a instancia de Conta e seus atributos capturados
		conta.add(clientCont);

	}

	public void callListClient() {

		if (client.size() != -1) {
			

			System.out.println("Retornando a lista de clientes");

			for (int i = 0; i <= client.size() - 1; i++) {

				System.out.println(client.get(i) + " - Dados da Conta: " + conta.get(i));
			}

		} else {
			System.out.println("Não há contas e clientes listados");
		}
	}

	public void callGravarDados() throws FileNotFoundException, UnsupportedEncodingException {
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("d:\\dadosclient.json"), "UTF-8");
		BufferedWriter bufWriter = new BufferedWriter(writer);
		JSONObject jsonObject = new JSONObject();

		if (client.size() != -1) {

			System.out.println("Gravando os dados em umarquivo");
			for (int i = 0; i < client.size(); i++) {
				try {
					jsonObject.put("nome", client.get(i).nome);
					jsonObject.put("email", client.get(i).email);
					jsonObject.put("telefone", client.get(i).telefone);
					jsonObject.put("agencia", conta.get(i).ag);
					jsonObject.put("conta", conta.get(i).conta);
					jsonObject.put("saldo", conta.get(i).saldo);
					//bufWriter.write(client.get(i).toString() + " Conta " + conta.get(i));
					bufWriter.write(jsonObject.toJSONString());
					bufWriter.newLine();

				} catch (IOException e1) {

					e1.printStackTrace();
				}

			}
			System.out.println("Salvo em d:\\dadosclient.json");
			try {
				bufWriter.close();
			} catch (IOException e1) {

				e1.printStackTrace();
			}

		}

		else {
			System.out.println("Não há dados e clientes para serem gravados");
		}

	}

	public void callConsultaArquivo() throws IOException, ParseException {

		BufferedReader br = null;
		JSONParser parser = new JSONParser();
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("d:\\dadosclient.json"));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println("{ Cliente: \t" + sCurrentLine + " }");

				Object obj;
				try {
					obj = parser.parse(sCurrentLine);
					JSONObject jsonObject = (JSONObject) obj;


				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}

		
		
	

	
	
	
	
	
	
	
	
	

	



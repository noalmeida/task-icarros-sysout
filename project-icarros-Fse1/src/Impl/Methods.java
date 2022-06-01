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

import model.Cliente;
import model.Conta;
import validacoes.Validacoes;

public class Methods extends Validacoes {

	Scanner leitor = new Scanner(System.in);
	List<Cliente> client = new ArrayList<>();
	List<Conta> conta = new ArrayList<>();
	Cliente clientAtrib = new Cliente();
	Conta clientCont = new Conta();

	public void callCadastrar() {

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
		clientCont.saldo = Double.valueOf(leitor.nextLine());
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
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("d:\\dadosclient.txt"), "UTF-8");
		BufferedWriter bufWriter = new BufferedWriter(writer);

		if (client.size() != -1) {

			System.out.println("Gravando os dados em umarquivo");
			for (int i = 0; i < client.size(); i++) {
				try {
					bufWriter.write(client.get(i).toString() + " Conta " + conta.get(i));
					bufWriter.newLine();

				} catch (IOException e1) {

					e1.printStackTrace();
				}

			}
			System.out.println("Salvo em d:\\dadosclient.txt");
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

	public void callConsultaArquivo() throws IOException {
		ArrayList<String> lines = new ArrayList<>();

		File fp = new File("d:\\dadosclient.txt");
		FileReader fr = new FileReader(fp);
		BufferedReader br = new BufferedReader(fr);
		String line;

		while ((line = br.readLine()) != null) {
			System.out.println("Consulta arquivo:.");
			lines.add(line + "\n");

			System.out.println(String.join("", lines));

		}
		fr.close();

	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessaArrayList {
	static int choise;
	static String response;
	static Scanner s = new Scanner(System.in);
	static int reciveNumberIndex;

	@SuppressWarnings("null")
	public static void main(String[] args) {

		ArrayList<String> reciveData = new ArrayList<>();

		ArrayList<String> registry = new ArrayList<>();

		ArrayList<String> nomeClient = new ArrayList<>();

		ArrayList<String> emailClient = new ArrayList<>();
		
		ArrayList<String> idadeClient = new ArrayList<>();
		
		String nomeClientAtt ="";
		String emailClientAtt ="";
		String idadeClientAtt ="";
		
	

		menuPanel();

		switch (choise) {

		case 1:

			System.out.println("Cadastro | para cadastrar, entre com seu nome primeiramente: ");
			
			nomeClient.add(s.nextLine());
			System.out.println("Cadastro |  para cadastrar, entre com seu email: ");
			emailClient.add(s.nextLine());
			System.out.println("Cadastro |  para cadastrar, entre com sua idade: ");
			idadeClient.add(s.nextLine());
			System.out.println("Cadastro |  Obrigado pelas informações! "
					+ "Deseja realizar outro cadastro? Se sim, digite : Y, se não: N");
			response = s.nextLine();

		

			for (int i = 1; i < 10; i++) {
				if (response.equals("Y")) {
					System.out.println("Cadastro | para cadastrar, entre com seu nome primeiramente: ");
					nomeClient.add(s.nextLine());
					System.out.println("Cadastro |  para cadastrar, entre com seu email: ");
					emailClient.add(s.nextLine());
					System.out.println("Cadastro |  para cadastrar, entre com sua idade: ");
					idadeClient.add(s.nextLine());
					System.out.println("Cadastro |  Obrigado pelas informações! "
							+ "Deseja realizar outro cadastro? Se sim, digite : Y, se não: N");
					response = s.nextLine();

				


				} else {
					menuPanel();

					switch (choise) {

					case 1:

						System.out.println("Cadastro | para cadastrar, entre com seu nome primeiramente: ");
						nomeClient.add(s.nextLine());
						System.out.println("Cadastro |  para cadastrar, entre com seu email: ");
						emailClient.add(s.nextLine());
						System.out.println("Cadastro |  para cadastrar, entre com sua idade: ");
						idadeClient.add(s.nextLine());
						System.out.println("Cadastro |  Obrigado pelas informações! "
								+ "Deseja realizar outro cadastro? Se sim, digite : Y, se não: N");
						response = s.nextLine();
	
					
			

						for (int a = 1; a < 4; a++) {
							if (response.equals("Y")) {
								System.out.println("Cadastro | para cadastrar, entre com seu nome primeiramente: ");
								nomeClient.add(s.nextLine());
								System.out.println("Cadastro |  para cadastrar, entre com seu email: ");
								emailClient.add(s.nextLine());
								System.out.println("Cadastro |  para cadastrar, entre com sua idade: ");
								idadeClient.add(s.nextLine());
								System.out.println("Cadastro |  Obrigado pelas informações! "
										+ "Deseja realizar outro cadastro? Se sim, digite : Y, se não: N");
								response = s.nextLine();
			
							

							} else {
								menuPanel();

							}

						}

					case 2:

						System.out.println("Entre com um número desejado para verificar registro:  ");
						reciveNumberIndex = s.nextInt();
						System.out.println("Retornando index referente..");
						if (!nomeClient.get(reciveNumberIndex).isEmpty()) {
							System.out.println("nome: "+ nomeClient.get(reciveNumberIndex) +" | email: "
						+emailClient.get(reciveNumberIndex)+" | idade: "+idadeClient.get(reciveNumberIndex) );
						} else {
							System.out.println("Não contem registros com esse index!");
						}
						break;
					case 3:

						System.out.println("Consultando as informações...");
						
						for(int i1 = 0 ; i1 < nomeClient.size(); i1++ ) {
							System.out.println("nome: "+ nomeClient.get(i1) +" | email: "
									+emailClient.get(i1)+" | idade: "+idadeClient.get(i1) + "\n" +
									"-------------------------------------------------------------");
						}

						break;

					case 4:
						  
						System.out.println("Entre com index para exclusão");
						reciveNumberIndex = s.nextInt();
						if(reciveNumberIndex < nomeClient.size()) {
							System.out.println("Excluindo registro..");
							
								System.out.println("nome: "+ nomeClient.remove(reciveNumberIndex) +" | email: "
										+emailClient.remove(reciveNumberIndex)+" | idade: "+idadeClient.remove(reciveNumberIndex) + "\n" +
										"-------------------------------------------------------------");
							
						}else {
							System.out.println("Numero de index não existente na lista.");
						}
						break;
						
					case 5:


						System.out.println("Entre com um número desejado para modificar/atualizar index de conteudo:  ");
						reciveNumberIndex = s.nextInt();

						try {
							if (nomeClient.size() > reciveNumberIndex) {
						
								s.nextLine();
								System.out.println("Inserir novo nome: ");
								nomeClientAtt = s.nextLine();
	
								System.out.println("Inserir novo email: ");
								emailClientAtt = s.nextLine();
								System.out.println("Inserir nova idade: ");
								idadeClientAtt= s.nextLine();
								nomeClient.set(reciveNumberIndex, nomeClientAtt );
								emailClient.set(reciveNumberIndex, emailClientAtt );
								idadeClient.set(reciveNumberIndex, idadeClientAtt );
								System.out.println("Retornando novo registro referente ao index colocado...");
								System.out.println("nome: "+ nomeClient.get(reciveNumberIndex) +" | email: "
										+emailClient.get(reciveNumberIndex)+" | idade: "+idadeClient.get(reciveNumberIndex) + "\n" +
										"-------------------------------------------------------------");

								System.out.println("Atualizado!");
							} else {
								System.out.println("A lista Esta vazia");
							}
						} catch (Exception err) {

						}
						break;

					default:
						System.out.println("Não existem alternativas para este numero escolhido =( ");

					}

				}

			}

		case 2:

			System.out.println("Entre com um número desejado para verificar registro:  ");
			reciveNumberIndex = s.nextInt();
			System.out.println("Retornando index referente..");
			if (!nomeClient.get(reciveNumberIndex).isEmpty()) {
				System.out.println("nome: "+ nomeClient.get(reciveNumberIndex) +" | email: "
			+emailClient.get(reciveNumberIndex)+" | idade: "+idadeClient.get(reciveNumberIndex) );
			} else {
				System.out.println("Não contem registros com esse index!");
			}
			break;

		case 3:

			System.out.println("Consultando as informações...");
			
			for(int i1 = 0 ; i1 < nomeClient.size(); i1++ ) {
				System.out.println("nome: "+ nomeClient.get(i1) +" | email: "
						+emailClient.get(i1)+" | idade: "+idadeClient.get(i1) + "\n" +
						"-------------------------------------------------------------");
			}

			break;
		case 4:
  
			System.out.println("Entre com index para exclusão");
			reciveNumberIndex = s.nextInt();
			if(reciveNumberIndex < nomeClient.size()) {
				System.out.println("Excluindo registro..");
				
					System.out.println("nome: "+ nomeClient.remove(reciveNumberIndex) +" | email: "
							+emailClient.remove(reciveNumberIndex)+" | idade: "+idadeClient.remove(reciveNumberIndex) + "\n" +
							"-------------------------------------------------------------");
				
			}else {
				System.out.println("Numero de index não existente na lista.");
			}
			break;
			

		case 5:

			System.out.println("Entre com um número desejado para modificar/atualizar index de conteudo:  ");
			reciveNumberIndex = s.nextInt();

			try {
				if (nomeClient.size() > reciveNumberIndex) {
			
					s.nextLine();
					System.out.println("Inserir novo nome: ");
	
					
					nomeClientAtt = s.nextLine();
	   
					System.out.println("Inserir novo email: ");
					emailClientAtt = s.nextLine();
					System.out.println("Inserir nova idade: ");
					idadeClientAtt= s.nextLine();
					nomeClient.set(reciveNumberIndex, nomeClientAtt );
					emailClient.set(reciveNumberIndex, emailClientAtt );
					idadeClient.set(reciveNumberIndex, idadeClientAtt );
					System.out.println("Retornando novo registro referente ao index colocado...");
					System.out.println("nome: "+ nomeClient.get(reciveNumberIndex) +" | email: "
							+emailClient.get(reciveNumberIndex)+" | idade: "+idadeClient.get(reciveNumberIndex) + "\n" +
							"-------------------------------------------------------------");

					System.out.println("Atualizado!");
				} else {
					System.out.println("A lista Esta vazia");
				}
			} catch (Exception err) {

			}
			break;

		default:
			System.out.println("N�o existem alternativas para este numero escolhido =( ");
		}

		s.close();
	}

	private static void menuPanel() {

		System.out.println("Olá seja bem vindo(a). Veja as opções e escolha segundo seu desejo");
		System.out.println("-------------------------------------------------------------");
		System.out.println("\nCadastro digite: 1.\nConsulta: digite 2.\nVisualização: digite 3.\n"
				+ "Exclusão: digite 4.\nModificar/Atualizar: digite 5.\n");
		System.out.println("-------------------------------------------------------------");
	
		choise = s.nextInt();
		
		s.nextLine();
	}

}

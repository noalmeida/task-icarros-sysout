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

		menuPanel();

		switch (choise) {

		case 1:

			System.out.println("Cadastro | para cadastrar, entre com seu nome primeiramente: ");
			registry.add(s.nextLine());
			System.out.println("Cadastro |  para cadastrar, entre com seu email: ");
			registry.add(s.nextLine());
			System.out.println("Cadastro |  para cadastrar, entre com sua idade: ");
			registry.add(s.nextLine());
			System.out.println("Cadastro |  Obrigado pelas informações! "
					+ "Deseja realizar outro cadastro? Se sim, digite : Y, se não: N");
			response = s.nextLine();
			reciveData.addAll(0, registry);
			System.out.println(reciveData);

			for (int i = 1; i < 10; i++) {
				if (response.equals("Y")) {
					System.out.println("Cadastro | para cadastrar, entre com seu nome primeiramente: ");
					registry.add(s.nextLine());
					System.out.println("Cadastro |  para cadastrar, entre com seu email: ");
					registry.add(s.nextLine());
					System.out.println("Cadastro |  para cadastrar, entre com sua idade: ");
					registry.add(s.nextLine());
					System.out.println("Cadastro |  Obrigado pelas informações! "
							+ "Deseja realizar outro cadastro? Se sim, digite : Y, se não: N");
					response = s.nextLine();
					reciveData.addAll(registry);


				} else {
					menuPanel();

					switch (choise) {

					case 1:

						System.out.println("Cadastro | para cadastrar, entre com seu nome primeiramente: ");
						registry.add(s.nextLine());
						System.out.println("Cadastro |  para cadastrar, entre com seu email: ");
						registry.add(s.nextLine());
						System.out.println("Cadastro |  para cadastrar, entre com sua idade: ");
						registry.add(s.nextLine());
						System.out.println("Cadastro |  Obrigado pelas informações! "
								+ "Deseja realizar outro cadastro? Se sim, digite : Y, se não: N");
						response = s.nextLine();
						reciveData.addAll(registry);
			

						for (int a = 1; a < 4; a++) {
							if (response.equals("Y")) {
								System.out.println("Cadastro | para cadastrar, entre com seu nome primeiramente: ");
								registry.add(s.nextLine());
								System.out.println("Cadastro |  para cadastrar, entre com seu email: ");
								registry.add(s.nextLine());
								System.out.println("Cadastro |  para cadastrar, entre com sua idade: ");
								registry.add(s.nextLine());
								System.out.println("Cadastro |  Obrigado pelas informações! "
										+ "Deseja realizar outro cadastro? Se sim, digite : Y, se não: N");
								response = s.nextLine();
								reciveData.addAll(registry);

							} else {
								menuPanel();

							}

						}

					case 2:

						System.out.println("Entre com um número desejado para verificar registro:  ");
						reciveNumberIndex = s.nextInt();
						System.out.println("Retornando index referente..");
						if (!reciveData.get(reciveNumberIndex).isEmpty()) {
							System.out.println(reciveData.get(reciveNumberIndex));
						} else {
							System.out.println("Não contem registros com esse index!");
						}
						break;

					case 3:

						System.out.println("Consultando as informações...");
						System.out.println(reciveData);

						break;
					case 4:

						System.out.println("Entre com um número desejado para excluir index de conteudo:  ");
						reciveNumberIndex = s.nextInt();
						System.out.println("Excluindo index referente..");
						if (!reciveData.get(reciveNumberIndex).isEmpty()) {
							System.out.println(reciveData.remove(reciveNumberIndex));
							System.out.println("Removido!");
						} else {
							System.out.println("Não contem registros com esse index!");
						}
						break;

					case 5:

						System.out
								.println("Entre com um número desejado para modificar/atualizar index de conteudo:  ");
						reciveNumberIndex = s.nextInt();

						try {
							if (reciveData.size() > reciveNumberIndex) {
								String registry2 = null;
								System.out.println("Inserir nome: ");
								registry2.split(" ");
								registry2 = s.nextLine();
								System.out.println("Inserir email: ");
								registry2 = s.nextLine();
								System.out.println("Inserir idade: ");
								registry2 = s.nextLine();
								reciveData.set(reciveNumberIndex, registry2);

								System.out.println("Atualizado!");
							}
						} catch (Exception err) {
							System.out.printf("Lista sem registros, vazia! erro > ", err);

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
			if (!reciveData.get(reciveNumberIndex).isEmpty()) {
				System.out.println(reciveData.get(reciveNumberIndex));
			} else {
				System.out.println("Não contem registros com esse index!");
			}
			break;

		case 3:

			System.out.println("Consultando as informações...");
			System.out.println(reciveData);

			break;
		case 4:

			System.out.println("Entre com um número desejado para excluir index de conteudo:  ");
			reciveNumberIndex = s.nextInt();
			System.out.println("Excluindo index referente..");
			if (!reciveData.get(reciveNumberIndex).isEmpty()) {
				System.out.println(reciveData.remove(reciveNumberIndex));
				System.out.println("Removido!");
			} else {
				System.out.println("Não contem registros com esse index!");
			}
			break;

		case 5:

			System.out.println("Entre com um número desejado para modificar/atualizar index de conteudo:  ");
			reciveNumberIndex = s.nextInt();

			try {
				if (reciveData.size() > reciveNumberIndex) {
					System.out.println("Inserir nome: ");
					String registry2 = null;
					registry2.split(" ");
					registry2 = s.nextLine();
					System.out.println("Inserir email: ");
					registry2 = s.nextLine();
					System.out.println("Inserir idade: ");
					registry2 = s.nextLine();
					reciveData.set(reciveNumberIndex, registry2);

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

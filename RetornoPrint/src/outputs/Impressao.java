package outputs;

public class Impressao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Noan", endereco = "Campina Grande", estado = "Paraiba", email="noamwt@gmail.com";
		double idade = 30;
		
		System.out.println(nome);
		System.out.println(endereco);
		System.out.printf("idade : %.0f, ", idade);
		System.out.println(" Estado: " + estado);
		System.out.println(email);

	}

}

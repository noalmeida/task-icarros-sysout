import java.util.Scanner;

public class CalculaTabuda {

	public static void main(String[] args) {
	
     
		System.out.println("Digite numero para calcular a multiplicacao, Tabuada"); 
		
		int numeroInsert;
		
		Scanner s = new Scanner(System.in);
		
		numeroInsert = s.nextInt();
		
		if (numeroInsert < 0 || numeroInsert > 10) {
			System.out.println("Numero inválido");
		}
		else {
			for (int count = 1; count < 11; count++) {
				int result;
				result = (count * numeroInsert);
				
				System.out.printf("%d x %d = %d \n", numeroInsert, count, result);
			}
		}
		s.close();
		
		
		
		
	}

}

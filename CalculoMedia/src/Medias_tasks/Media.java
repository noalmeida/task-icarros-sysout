package Medias_tasks;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		
		String nomeAluno;
		int Nota1,Nota2,Nota3,Nota4,Media;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu nome ?");
		nomeAluno = s.nextLine();
		System.out.println("Poderia dizer qual foi a sua primeira nota? digite o numero de sua nota: ");
		Nota1 = s.nextInt();
		System.out.println("Poderia dizer qual foi a sua segunda nota? digite o numero de sua nota: ");
		Nota2 = s.nextInt();
		System.out.println("Poderia dizer qual foi a sua terceira nota? digite o numero de sua nota: ");
		Nota3 = s.nextInt();
		System.out.println("Poderia dizer qual foi a sua quarta nota? digite o numero de sua nota: ");
		Nota4 = s.nextInt();
		Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
		System.out.printf("A média das suas notas foram : %d" , Media);

		

	}

}

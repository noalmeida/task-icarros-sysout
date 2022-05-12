package ProcessaNotas;

import java.util.Scanner;

public class ProcessaNotas {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		for (int count = 0; count < 4; count++) {
		
			String[] students = new String[5];

			System.out.println("Poderia nos informar seu nome?");
			students[0] = s.nextLine();
			System.out.println("Poderia nos informar sua primeira nota?");
			students[2] = s.nextLine();
			System.out.println("Poderia nos informar sua segunda nota?");
			students[3] = s.nextLine();

			int calculat = (Integer.parseInt(students[2]) + Integer.parseInt(students[3])) / 2;
			if (calculat > 5) {
				students[4] = "Aprovado";

			} else if (calculat == 5) {
				students[4] = "Recuperação";
			} else {
				students[4] = "Reprovado";
			}

			System.out.printf("Olá %s, nota1 = %s, nota2 = %s, média = %d Restultado= %s \n", students[0], students[2],
					students[3], calculat, students[4]);

		}
		s.close();
	}
}

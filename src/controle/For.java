package controle;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota = 0;
		double somaNotas = 0;

		for (int i = 0; i < 3; i++) {
			nota = sc.nextDouble();
			somaNotas += nota;
		}

		System.out.printf("A média é: %.2f", somaNotas/3);
		sc.close();

	}

}

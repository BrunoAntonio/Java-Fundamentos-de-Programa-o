package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota = 0;
		double somaNotas = 0;
		double numeroNotas = 0;

		while (nota != -1) {
			nota = sc.nextDouble();

			if (nota <= 10 && nota >= 0) {
				somaNotas += nota;
				numeroNotas++;
			}
		}
		System.out.printf("A média é: %.2f", somaNotas / numeroNotas);
		sc.close();

	}

}

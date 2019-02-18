package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota = 0;
		double somaNotas = 0;
		double numeroNotas = 0;

		do {
			nota = sc.nextDouble();
			if (nota >= 0 && nota <= 10) {
				somaNotas += nota;
				numeroNotas++;
			}
		} while (nota != -1);

		System.out.printf("A média é: %.2f", somaNotas / numeroNotas);
		sc.close();
	}

}

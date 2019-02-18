package controle;

import java.util.Scanner;

public class ExercicioNumPrimo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um número: ");
		int num = sc.nextInt();

		int countadorDivisores = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {

				countadorDivisores++;
			}
		}

		if (countadorDivisores == 0) {
			System.out.println(num + " é um número primo");
		} else {
			System.out.println(num + " não é um número primo");
		}

		sc.close();

	}

}

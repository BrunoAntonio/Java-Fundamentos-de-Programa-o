package controle;

import java.util.Scanner;

public class ExercicioNumPrimo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um n�mero: ");
		int num = sc.nextInt();

		int countadorDivisores = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {

				countadorDivisores++;
			}
		}

		if (countadorDivisores == 0) {
			System.out.println(num + " � um n�mero primo");
		} else {
			System.out.println(num + " n�o � um n�mero primo");
		}

		sc.close();

	}

}

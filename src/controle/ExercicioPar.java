package controle;

import java.util.Scanner;

public class ExercicioPar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num <= 10 && num >= 0) {
			if (num % 2 == 0) {
				System.out.println("O n�mero " + num + " est� entre 0 e 10 e � Par");
			} else {
				System.out.println("O n�mero " + num + " est� entre 0 e 10 e � Impar");
			}
		} else {
			System.out.println("O n�mero " + num + " n�o est� entre 0 e 10");
		}

		sc.close();

	}

}

package controle;

import java.util.Random;
import java.util.Scanner;

public class ExercicioNumAleatorio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("N�mero aleatorio entre 0 e 100: ");

		Random numAleatorio = new Random();
		int numSorteado = numAleatorio.nextInt(101);

		System.out.println("N�mero aleat�rio: " + numSorteado);

		for (int i = 1; i <= 10; i++) {
			System.out.println("");
			System.out.print("Digite um n�mero: ");
			int numero = sc.nextInt();
			int tentativas = 10 - i;
			if (numero < numSorteado) {
				System.out.println("");
				System.out.println("O n�mero sorteado � maior do que " + numero);
				System.out.println("Tem " + tentativas + " tentativas");
			} else if (numero > numSorteado) {
				System.out.println("");
				System.out.println("O n�mero sorteado � menor do que " + numero);
				System.out.println("Tem " + tentativas + " tentativas");
			} else {
				System.out.println("N�mero Correcto");
				break;
			}

		}

		sc.close();
	}

}

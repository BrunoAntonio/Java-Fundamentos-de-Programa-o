package controle;

import java.util.Random;
import java.util.Scanner;

public class ExercicioNumAleatorio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Número aleatorio entre 0 e 100: ");

		Random numAleatorio = new Random();
		int numSorteado = numAleatorio.nextInt(101);

		System.out.println("Número aleatório: " + numSorteado);

		for (int i = 1; i <= 10; i++) {
			System.out.println("");
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			int tentativas = 10 - i;
			if (numero < numSorteado) {
				System.out.println("");
				System.out.println("O número sorteado é maior do que " + numero);
				System.out.println("Tem " + tentativas + " tentativas");
			} else if (numero > numSorteado) {
				System.out.println("");
				System.out.println("O número sorteado é menor do que " + numero);
				System.out.println("Tem " + tentativas + " tentativas");
			} else {
				System.out.println("Número Correcto");
				break;
			}

		}

		sc.close();
	}

}

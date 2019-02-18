package controle;

import java.util.Scanner;

public class ExercicioData {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();

		// Verificar se o ano � divis�vel por 4
		// Verificar se o ano n�o � divis�vel por 100

		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano +" � um ano bissexto");
		} else {
			System.out.println(ano +" n�o � um ano bissexto");
		}
		sc.close();

	}

}

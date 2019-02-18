package controle;

import java.util.Scanner;

public class ExercicioData {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();

		// Verificar se o ano é divisível por 4
		// Verificar se o ano não é divisível por 100

		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano +" é um ano bissexto");
		} else {
			System.out.println(ano +" não é um ano bissexto");
		}
		sc.close();

	}

}

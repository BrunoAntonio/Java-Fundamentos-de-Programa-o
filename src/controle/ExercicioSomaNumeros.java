package controle;

import java.util.Scanner;

public class ExercicioSomaNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		while (num >= 0) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
			if (num >= 0) {
				soma += num;
				System.out.println("A soma é: " + soma);
				System.out.println("");
			}		
		}

		sc.close();
	}

}

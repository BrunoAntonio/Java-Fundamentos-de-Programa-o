package controle;

import java.util.Scanner;

public class ExercicioMaiorNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int num=0;

		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();

			if (num > max) {
				max = num;
			}
		}
		
		System.out.println("O maior número é: "+max);

		sc.close();
	}

}

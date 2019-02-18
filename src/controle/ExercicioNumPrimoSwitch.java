package controle;

import java.util.Scanner;

public class ExercicioNumPrimoSwitch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int num = sc.nextInt();
		
		int contadorDivisores=0;
		for (int i=2 ; i<num ; i++) {
			if (num % i == 0) {
				contadorDivisores++;
			}
		}
		
		switch (contadorDivisores) {
		case  0:
			System.out.println(num+" é um número primo");
			break;
		default:
			System.out.println(num+" não é um número primo");
			break;
		}
		
		
		sc.close();
	}

}

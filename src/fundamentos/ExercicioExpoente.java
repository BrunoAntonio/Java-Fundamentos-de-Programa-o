package fundamentos;

import java.util.Scanner;

public class ExercicioExpoente {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira um número:");
		double num = sc.nextDouble();
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.println("Numero elevado ao quadrado: "+quadrado);
		System.out.println("Numero elevado ao cubo: "+cubo);
		
		sc.close();
		
	}

}

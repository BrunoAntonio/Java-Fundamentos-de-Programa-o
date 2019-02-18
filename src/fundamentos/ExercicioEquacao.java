package fundamentos;

import java.util.Scanner;

public class ExercicioEquacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Valor de a: ");
		double a = sc.nextDouble();
		System.out.println("Valor de b: ");
		double b = sc.nextDouble();
		System.out.println("Valor de c: ");
		double c = sc.nextDouble();
		
		double delta = (b*b)-(4*a*c);
		double x1 = (-b-Math.sqrt(delta))/2*a;
		double x2 = (-b+Math.sqrt(delta))/2*a;
				
		System.out.println("x1: "+ x1);
		System.out.println("x2: "+ x2);
			
		sc.close();
		
	}

}

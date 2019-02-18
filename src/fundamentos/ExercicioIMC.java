package fundamentos;

import java.util.Scanner;

public class ExercicioIMC {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Altura? ");
		double altura = sc.nextDouble();
		System.out.println("Peso?");
		double peso = sc.nextDouble();
		
		double imc=peso/(altura*altura);
		System.out.printf("IMC: %.2f", imc);
		
		
		sc.close();
	}

}

package controle;

import java.util.Scanner;

public class ExercicioNotas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Insira a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		if (media >= 7.0 ) {
			System.out.println("M�dia: "+media+"\nEst� aprovado");
		}else if (media >= 4) {
			System.out.println("Media: "+media+"\nEst� em recupera��o");
		}else {
			System.out.println("M�dia: "+media+"\nEst� reprovado");
		}
		
		
		sc.close();
	}

}

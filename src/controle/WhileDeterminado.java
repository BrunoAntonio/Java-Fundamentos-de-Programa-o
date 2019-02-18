package controle;

import java.util.Scanner;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota = 0;
		double somaNotas = 0;
		double numeroNotas = 0;
		
		while (numeroNotas<3) {
			nota = sc.nextDouble();
			somaNotas += nota;
			numeroNotas++;			
		}	
		System.out.printf("A média é: %.2f",somaNotas/3);
		sc.close();
	}

}

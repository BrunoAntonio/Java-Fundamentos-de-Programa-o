package fundamentos;

import java.util.Scanner;

public class ExercicioCelsiusToFahrenheit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit-32.0)*5.0/9.0;
		
		System.out.println("A temperatura em Celsius é: "+celsius+"ºC");
		
		sc.close();
	}

}

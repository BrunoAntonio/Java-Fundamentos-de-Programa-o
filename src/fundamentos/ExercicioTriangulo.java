package fundamentos;

import java.util.Scanner;

public class ExercicioTriangulo {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Altura do triangulo: ");
			double altura = sc.nextDouble();
			System.out.println("Base do triangulo");
			double base = sc.nextDouble();
			
			double area =(base*altura)/2;
			
			System.out.println("Área do triangulo: "+area);
			
			
			sc.close();
			
		}

	}



package controle;

import java.util.Scanner;

public class ExercicioString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um palavra: ");
		
		String palavra = sc.nextLine();
		
			
		for (int i = 0 ; i < palavra.length() ; i++) {
			System.out.println(palavra.split("")[i]);
		}
		
		sc.close();
	}

}

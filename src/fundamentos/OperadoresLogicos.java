package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean executouTrabalho1 = true;
		boolean executouTrabalho2 = false;
		
		//Operador l�gico: ou
		boolean comprouGelado = executouTrabalho1 || executouTrabalho2;
		System.out.println("Comer gelado = "+comprouGelado);
		
		//Operador l�gico: e
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		System.out.println("Comprou tv50 = "+comprouTv50);
		
		//Operador l�gico: ou condicional
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		System.out.println("Comprou tv32 = "+comprouTv32);
		
		//Operador unit�rio intruso
		System.out.println("Fome = "+ !comprouGelado);
		
		
	}

}

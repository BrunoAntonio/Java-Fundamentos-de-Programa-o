package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean executouTrabalho1 = true;
		boolean executouTrabalho2 = false;
		
		//Operador lógico: ou
		boolean comprouGelado = executouTrabalho1 || executouTrabalho2;
		System.out.println("Comer gelado = "+comprouGelado);
		
		//Operador lógico: e
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		System.out.println("Comprou tv50 = "+comprouTv50);
		
		//Operador lógico: ou condicional
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		System.out.println("Comprou tv32 = "+comprouTv32);
		
		//Operador unitário intruso
		System.out.println("Fome = "+ !comprouGelado);
		
		
	}

}

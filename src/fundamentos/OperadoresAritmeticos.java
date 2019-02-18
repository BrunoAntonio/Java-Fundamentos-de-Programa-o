package fundamentos;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int numb1=3;
		int numb2=4;
		int numb3=5;
		
		//Operadores: + - * / %
		int soma=numb1+numb2+numb3+6;
		System.out.println(soma);
		System.out.println(numb1-numb2-numb3);
		
		//Cuidado com a precedência
		System.out.println(numb1+numb3*numb2/2);
		System.out.println((numb1+numb3)*numb2/2);
		
		//Resto da divisão
		System.out.println(10%3);
		
	}

}

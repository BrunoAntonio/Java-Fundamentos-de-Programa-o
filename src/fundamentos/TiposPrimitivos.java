package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Tipos primitivo boleano
		boolean b01 = true;
		boolean b02 = false;
		System.out.printf("%b %b \n",b01,b02);
		
		//Tipos primitivo caracter
		char c1='a';
		char c2='!';
		char c3='\u0050';
		System.out.printf("%c %c %c \n",c1,c2,c3);
		
		//Tipos primitivo inteiro
		byte b = 127;
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		
		System.out.printf("%d %d %d %d \n",b,s,i,l );
		System.out.println(Integer.toBinaryString(b));
		
		//Tipos primitivo reais(ponto flutuante)
		float f = 3.1416F;
		double d = 2.45;
		System.out.printf("%.2f %.1f",f,d);
				
		
	}

}

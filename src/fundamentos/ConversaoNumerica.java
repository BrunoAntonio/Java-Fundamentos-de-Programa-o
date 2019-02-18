package fundamentos;

public class ConversaoNumerica {
	
	public static void main(String[] args) {
		
		//conversao explicita - double para float
		float f = (float) 0.1;
		System.out.println(f);
		
		//conversao explicita - int para double
		int i1 = (int) 1.2;
		System.out.println(i1);
		
		//conversao implicita
		int i2 = 'a';
		System.out.println(i2);		
				
		//conversao implicita
		double d = 1001;
		System.out.println(d);
		
		 
	}

}

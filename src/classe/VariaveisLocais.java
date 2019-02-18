package classe;

public class VariaveisLocais {
	
	int a = 2;
	int a1 = 2;

	
	void teste1() {
		int a1 = 7;
		System.out.println(a);
		System.out.println(this.a1);
		
		if (a1 > 3) {
			int a2 = a1;
		}	
		//System.out.println(a2);	
	}
	
	void teste2() {
		int a1 = 7;
		System.out.println(a1);
		
		//int i = 0;
		for (int i = 0; i < 4; i++) {
			
		}	
		//System.out.println(i);
	}
}

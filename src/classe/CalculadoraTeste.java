package classe;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(4.0, 5.1));
		
		calc.acrescentar(10.0);
		System.out.println(calc.obterResultado());
		
		calc.limpar();
		System.out.println(calc.obterResultado());
	}
}

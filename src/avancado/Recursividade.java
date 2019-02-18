package avancado;

public class Recursividade {

	private static int factorialFor(int numero) {
		int fact = 1;
		for (int i = 1; i <= numero; i++) {
			fact *= i;
		}
		return fact;
	}

	private static int factorial(int numero) {
		if (numero <= 1) {
			return 1;
		}
		return numero * factorial(numero - 1);
	}

	public static void main(String[] args) {

		System.out.println(factorialFor(5));
		System.out.println(factorial(5));

	}

}

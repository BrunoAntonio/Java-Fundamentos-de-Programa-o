package avancado.varargs;

public class Pessoa {

	public double peso = 0;

	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}

	public double getPeso() {
		return peso;
	}

	public void comer(Comida... comidas) {
		for (Comida c : comidas) {
			this.peso += c.getPeso();
		}
		
	}

}

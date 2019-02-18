package oo.polimorfismo;

public class Pessoa {

	public double peso = 0;

	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}

	public double getPeso() {
		return peso;
	}

	public double comer(Comida comida) {
		return this.peso += comida.getPeso();
	}

}

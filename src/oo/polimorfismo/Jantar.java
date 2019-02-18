package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
	Pessoa pessoa = new Pessoa(80.0);
	Arroz arroz = new Arroz();
	Massa massa = new Massa();
	Gelado gelado = new Gelado();
	
	System.out.println(pessoa.getPeso());
	
	arroz.setPeso(0.20);
	massa.setPeso(0.30);
	gelado.setPeso(0.25);
	
	pessoa.comer(arroz);
	System.out.println(pessoa.getPeso());
	
	pessoa.comer(massa);
	System.out.println(pessoa.getPeso());
	
	pessoa.comer(gelado);
	System.out.println(pessoa.getPeso());
	
	}
}

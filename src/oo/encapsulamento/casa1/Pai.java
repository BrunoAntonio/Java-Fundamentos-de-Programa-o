package oo.encapsulamento.casa1;

import oo.encapsulamento.casa2.Filha;

public class Pai {
	
	protected String pai = "Eu sou o pai";
	
	public static void main(String[] args) {
		
		Pai meuPai = new Pai();
		Mae minhaMae = new Mae();
		Filha minhaFilha = new Filha();
		
		System.out.println(meuPai.pai);
		System.out.println(minhaMae.mae);
		System.out.println(minhaFilha.filha);
		
	}

}

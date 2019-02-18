package oo.encapsulamento.casa1;

import oo.encapsulamento.casa2.Filha;

public class Mae {
	
	String mae = "Eu sou a mãe";
	
	public static void main(String[] args) {
		
	Mae minhaMae = new Mae();
	Pai meuPai = new Pai();
	Filha filha = new Filha();
	
	System.out.println(minhaMae.mae);
	System.out.println(meuPai.pai);
	System.out.println(filha.filha);
		
	}
	

}

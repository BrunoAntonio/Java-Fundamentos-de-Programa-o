package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Pai;

public class Filha extends Pai {
	
	public String filha = "Eu sou a filha";
	
	public static void main(String[] args) {
		
		Filha filha = new Filha();
		
		System.out.println(filha.filha);
		System.out.println(filha.pai);
		
	}

}

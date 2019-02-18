package oo.encapsulamento.casa2;

public class MaridoFilha {
	
	private String marido = "Eu sou o marido da filha";
	
	public static void main(String[] args) {
		
		MaridoFilha marido = new MaridoFilha();
		Filha minhaFilha = new Filha();
		
		System.out.println(marido.marido);
		System.out.println(minhaFilha.filha);
		
	}

}

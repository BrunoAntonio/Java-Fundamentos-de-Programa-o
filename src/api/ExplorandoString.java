package api;

public class ExplorandoString {

	public static void main(String[] args) {
		
		String nome = "Bruno";
		
		//Alguns Métodos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('u'));
		System.out.println(nome.startsWith("Bru"));
		System.out.println(nome.charAt(3));
		System.out.println(nome.equalsIgnoreCase("bruno"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" Antonio").concat( " !"));
		
		//String é imutável
		System.out.println(nome);
		nome = nome.toUpperCase().substring(0, 3).concat(" !");
		System.out.println(nome);
		
	}

}

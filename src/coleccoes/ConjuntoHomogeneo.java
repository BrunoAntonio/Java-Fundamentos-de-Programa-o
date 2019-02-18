package coleccoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHomogeneo {
	
	public static void main(String[] args) {
		
		Set<String> aprovados = new HashSet<>();
		//Set<String> aprovados = new TreeSet<>();
		//Set<String> aprovados = new LinkedHashSet<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Madalena");
		aprovados.add("Rita");
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		
	}

}

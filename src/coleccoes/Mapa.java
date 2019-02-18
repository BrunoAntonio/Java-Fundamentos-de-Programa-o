package coleccoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> aprovados = new HashMap<>();
		aprovados.put(1, "João");
		aprovados.put(2, "Pedro");
		aprovados.put(3, "Madalena");
		aprovados.put(4, "Rita");
		
		System.out.println(aprovados.keySet());
		System.out.println(aprovados.values());
		System.out.println(aprovados.entrySet());
		
		aprovados.put(3, "Maria Madalena");
		System.out.println(aprovados.get(3));
		
		System.out.println(aprovados.containsKey(3));
		System.out.println(aprovados.containsValue("Madalena"));
		
		System.out.println("Chaves...");
		for (Integer chave : aprovados.keySet()) {
			System.out.println(chave);	
		}
		
		System.out.println("Valores...");
		for (String nome : aprovados.values()) {
			System.out.println(nome);
		}
		
		System.out.println("Chaves/Valores...");
		for (Entry<Integer, String> tabela : aprovados.entrySet()) {
			System.out.println(tabela.getKey()+" "+tabela.getValue());
		}
	}

}

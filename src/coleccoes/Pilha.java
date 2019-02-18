package coleccoes;

import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<>();
		//Deque<String> pilhaEFila = new ArrayDeque<>();
		pilha.push("O Pequeno Príncipe");
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println("peek...");
		System.out.println(pilha.peek());
		System.out.println(pilha.peek());
		
		System.out.println("pop...");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		//pilhaEFila.poll();
		//pilhaEFila.remove();
	}

}

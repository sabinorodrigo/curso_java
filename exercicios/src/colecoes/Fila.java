package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Dark Magician"); // Lança uma exceção
		fila.offer("Dark Magician Girl"); // retorna false
		fila.add("Dark Magician of Chaos");
		fila.offer("Magician of Black Chaos");
		fila.add("Illusion of Chaos");
		fila.add("Magician of Chaos");
		
		// Peek e Element -> obter o próximo elemento da fila
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek()); // returna null
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // lança  uma exceção
		System.out.println(fila.element());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		
		// Poll e Remove -> obter o próximo elemento da fila e remove!
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
		
	}
}
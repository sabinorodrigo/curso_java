package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Príncipe");
		livros.add("Don Quixote");
		livros.add("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println();
		for (String livro : livros) {
			System.out.println(livro);
		}
		System.out.println();
		
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		livros.isEmpty();
		System.out.println(livros);
		
	}
}

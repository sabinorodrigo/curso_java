package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> lista = new TreeSet<>();
		lista.add("Bilbo");
		lista.add("Gandalf");
		lista.add("Beorn");
		lista.add("Thorin");
		lista.add("Balin");
		lista.add("Dwalin");
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		Set<Integer> nums = new TreeSet<>();
		nums.add(14);
		nums.add(28);
		nums.add(30);
		nums.add(40);

		for (Integer number : nums) {
			System.out.printf("%n%d", number);
		}
	}
}

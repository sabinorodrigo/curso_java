package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		Usuario darkMagician = new Usuario("Dark Magician");
		Usuario darkMagicianGirl = new Usuario("Dark Magician");
		Usuario darkMagicianOfChaos = new Usuario("Dark Magician of Chaos"); 
		
		usuarios.add(darkMagician);
		usuarios.add(darkMagicianGirl);
		usuarios.add(darkMagicianOfChaos);
		
		boolean resultado = usuarios.contains(new Usuario("Dark Magician"));
		System.out.println(resultado);
		
		System.out.println(darkMagician.equals(darkMagicianGirl));
	}
}

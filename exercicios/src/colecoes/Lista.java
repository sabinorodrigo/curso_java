package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> usuario = new ArrayList<>();
		
		Usuario u1 = new Usuario("Smalg");
		
		usuario.add(u1);
		usuario.add(new Usuario("Bilbo"));
		usuario.add(new Usuario("Gandalf"));
		usuario.add(new Usuario("Thorin"));
		usuario.add(new Usuario("Beorn"));
		usuario.add(new Usuario("Beorn"));
		
		System.out.println(usuario.get(3));
		
		System.out.println(">>> " + usuario.remove(1));
		System.out.println(usuario.remove(new Usuario("Beorn")));
		
		System.out.println("Tem? " + usuario.contains(new Usuario("Thorin")));
		
		for (Usuario u : usuario) {
			System.out.println(u.nome);
		}
	}
}

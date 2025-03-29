package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Dark Magician");
		usuarios.put(2, "Dark Magician Girl");
		usuarios.put(3, "Dark Magician of Chaos");
		usuarios.put(4, "Magician of Black Chaos");
		usuarios.put(5, "Illusion of Chaos");
		usuarios.put(6, "Magician of Chaos");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Magician of Chaos"));
		
		System.out.println(usuarios.get(1));
		
		System.out.println("Chave");
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("Valor");
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println("Chave Valor");
		for (Entry<Integer, String> chaveValor : usuarios.entrySet()) {
			System.out.print(chaveValor.getKey() + " ");
			System.out.println(chaveValor.getValue());
		}
	}
}

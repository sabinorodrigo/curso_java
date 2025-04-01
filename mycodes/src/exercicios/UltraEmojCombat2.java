package exercicios;

import java.util.ArrayList;
import java.util.List;

public class UltraEmojCombat2 {

	public static void main(String[] args) {
		
		List<Lutador> l = new ArrayList<>();
		
		l.add(new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1));
		l.add(new Lutador("Putscript", "Brasil", 29, 1.68f, 57.9, 14, 2, 3));
		l.add(new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1));
		l.add(new Lutador("Dead Code", "Austrália", 28, 1.94, 81.6, 13, 0, 2));
		l.add(new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3));
		l.add(new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4));
		
		l.forEach(lutador -> lutador.status());
	}
}

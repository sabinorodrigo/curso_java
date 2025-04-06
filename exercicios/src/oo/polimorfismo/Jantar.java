package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa(99.65);
		
		Comida arroz = new Arroz(0.200);
		Comida feijao = new Feijao(0.100);
		
		System.out.println(joao.getPeso());
		
		joao.comer(arroz);
		joao.comer(feijao);
		
		System.out.println(joao.getPeso());
		
		Comida sorvete = new Sorvete(0.4);
		
		joao.comer(sorvete);
		
		System.out.println(joao.getPeso());
	}
}

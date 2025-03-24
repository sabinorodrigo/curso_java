package classe.desafio;

public class Jantar {

	public static void main(String[] args) {

		Pessoa bilbo = new Pessoa("Bilbo", 57.22);
		
		Comida macarrao = new Comida("Macarrão", 0.420);
		Comida arroz = new Comida("Arroz", 0.350);
		Comida sorvete = new Comida("Sorvete", 0.550);
		
		
		System.out.println(bilbo.apresentar());
		
		bilbo.comer(arroz);
		bilbo.comer(macarrao);
		bilbo.comer(sorvete);
		System.out.println(bilbo.apresentar());
		
	}
}

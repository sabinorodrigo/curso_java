package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		this(350);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
	
	/*@Override
	void acelerar() {
		velocidadeAtual += 15;
	}*/
	
	@Override
	public String toString() {
		return "Ferrari: velocidade atual é: " + velocidadeAtual + "Km/h";
	}
	
}

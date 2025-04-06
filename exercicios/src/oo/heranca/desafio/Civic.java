package oo.heranca.desafio;

public class Civic extends Carro {

	public Civic() {
		super(240);
	}
	
	@Override
	public String toString() {
		return "Civic: velocidade atual é: " + velocidadeAtual + "Km/h";
	}
}

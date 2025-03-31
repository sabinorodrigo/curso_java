package oo.heranca;

public class Ferrari extends Carro {
	
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}

	@Override
	public String toString() {
		return "Ferrari: Velocidade atual é " + velocidadeAtual + "Km/h";
	}
}
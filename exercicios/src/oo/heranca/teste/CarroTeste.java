package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic);
		
		
		Ferrari ferrari = new Ferrari();
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		
		ferrari.acelerar();
		ferrari.frear();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.acelerar();
		
		System.out.println(ferrari);
		
	}
}

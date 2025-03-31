package oo.heranca;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c = new Civic();
		c.acelerar();
		c.acelerar();
		
		System.out.println(c);
		
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		
		System.out.println(c);
		
		Ferrari f = new Ferrari();
		f.acelerar();
		f.acelerar();
		f.acelerar();
		
		System.out.println(f);
	}
}

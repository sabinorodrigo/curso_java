package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo calc = new Somar();
		System.out.println(calc.executar(5, 10));
		
		calc = new Multiplicar();
		System.out.println(calc.executar(6, 8));
		
		calc = new Dividir();
		System.out.println(calc.executar(7, 4));
		
		calc = new Subtrair();
		System.out.println(calc.executar(10, 5));
	}
}

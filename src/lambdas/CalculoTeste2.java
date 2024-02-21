package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(3, 2));
		
		calc = (x, y) -> { return x - y; };
		System.out.println(calc.executar(50, 45));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2.5, 2));
		
		calc = (x, y) -> x / y;
		System.out.println(calc.executar(20, 4));
	}
}


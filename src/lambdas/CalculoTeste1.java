package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Subtrair();
		System.out.println(calculo.executar(6, 1));
		
		calculo = new Dividir();
		System.out.println(calculo.executar(20, 4));
	}
}

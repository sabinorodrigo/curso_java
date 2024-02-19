package fundamentos;

import java.util.Scanner;

public class Temeperatura2 {

	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma temperatura em fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.printf("O resultado em celsius é %.2fC%n",celsius);
		
		sc.close();
	}
}

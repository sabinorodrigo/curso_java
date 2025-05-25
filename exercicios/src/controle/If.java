package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double media = 7;
		System.out.print("Informe a média: ");
		double nota = sc.nextDouble();
		
		if (nota <= 10 && media >= nota ) {
			System.out.print("Aprovado! ");
			System.out.println("PARABÉNS!!!");
		}
		
		if (nota < media && nota >= 4.5) {
			System.out.println("Recuperação");
		}
		
		if (nota < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
}

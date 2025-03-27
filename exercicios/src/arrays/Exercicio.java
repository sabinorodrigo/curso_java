package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 8.0;
		notasAlunoA[1] = 6.9;
		notasAlunoA[2] = 7.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(notasAlunoA[i]);
		}
		
		double[] notas = {3.4, 8.5, 8.8, 10, 9.3, 4.5, 3.5, 6.5, 7.78, 8.9, 5.6};
		System.out.println(notas[3 + 5] += 3);
		
		double soma = notas[2] + notas[6] + notas[9];
		System.out.printf("Soma das notas dos indices 2, 6 e 9 é: %.2f%n ", soma);
		
		double media = soma / 3;
		System.out.printf("%nMédia da soma %.2f%n%n", media);
		
	}
}


package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Dark");
		System.out.print(" Magician\n");
		
		System.out.printf("Números Primos %d %d %d %d %d%n", 2, 3, 5, 7, 11);
		System.out.printf("Salário: %.1f%n", 12456.45);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		sc.close();
	}
}

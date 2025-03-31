package yugioh;

import java.util.Scanner;

import yugioh.monster.Monster;

public class YugiohMain2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdeMonster = 3;
		Monster[] m = new Monster[3];
		
		
		for (int i = 0; i < m.length; i++) {
			System.out.print("Qual monstro você quer? ");
		}
		
		
		sc.close();
		
	}
	
}

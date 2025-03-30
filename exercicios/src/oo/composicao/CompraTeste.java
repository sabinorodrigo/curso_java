package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Dark Magician";
		c1.adicionarItem("Magic Formula", 2, 749.99);
		c1.adicionarItem("Dark Magician Curtain", 3, 559.98 );
		c1.adicionarItem(new Item("Book of Arts Secrets", 1, 399.98));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		// Só para mostrar a relação bidirecional!!!
		double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.printf("Total R$%.2f%n", total);
	}
}

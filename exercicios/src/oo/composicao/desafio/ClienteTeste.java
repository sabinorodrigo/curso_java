package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Daumariano");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 10.85, 11);
		compra1.adicionarItem(new Produto("Notebook", 2545.98), 4);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 5.25, 55);
		compra2.adicionarItem(new Produto("Impressora", 1345.98), 1);
		
		c1.compras.add(compra1);
		c1.compras.add(compra2);
		
		System.out.println(c1.obterValorDaCompra());
		
	}
}

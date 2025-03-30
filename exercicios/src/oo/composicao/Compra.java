package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	String cliente;
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, int quatidade, double preco) {
		this.adicionarItem(new Item(nome, quatidade, preco));
	}
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quatidade * item.preco;
		}

		return total;
	}
}

package oo.composicao;

public class Item {

	String nome;
	int quatidade;
	double preco;
	
	Compra compra;
	
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quatidade = quantidade;
		this.preco = preco;
	}
}

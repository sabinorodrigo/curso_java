package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4599.98);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 15.98;
		
		Produto.desconto = 0.29;

		System.out.printf("%s R$%.2f%n", p1.nome, p1.precoComDesconto());
		System.out.printf("%s R$%.2f%n", p2.nome, p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.25);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		
		System.out.printf("Média do carrinho = R$%.2f.\n", mediaCarrinho);
	}
}

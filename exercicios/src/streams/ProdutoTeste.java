package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto notebook = new Produto("Notebook", 3, 2550.00);
		Produto tablet = new Produto("Tablet", 4, 1799.00);
		Produto smartfone = new Produto("Smartfone", 1, 4890.00);
		Produto teclado = new Produto("Teclado", 2, 590.00);
		
		List<Produto> produtos = Arrays.asList(notebook, tablet, smartfone, teclado);
		
		Stream<Produto> stream = produtos.stream();
		
		System.out.println("\nProduto - nome");
		stream.forEach(prod -> System.out.println(prod.getNome()));
		System.out.println("\nProduto - preço");
		//stream.forEach(prod -> System.out.println(prod.getPreco()));
	}
}

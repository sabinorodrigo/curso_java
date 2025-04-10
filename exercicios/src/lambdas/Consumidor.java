package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.NOME + "!!!");
		
		Produto p1 = new Produto("SSD-Nvme", 534.99, 0.10);
		//imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 2459.99, 0.25);
		Produto p3 = new Produto("impressora", 1045.98, 0.15);
		Produto p4 = new Produto("Scanner", 459.95, 0.10);
		Produto p5 = new Produto("diskette", 4.45, 0.05);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.PRECO));
		produtos.forEach(System.out::println);
	}
}

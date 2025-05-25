package teste.basico;

import infra.DAO;
import model.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Escudo", 1600.00);
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("ID do produto " + produto.getId());
	}
}

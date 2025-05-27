package teste.umpramuitos;

import infra.DAO;
import model.basico.Produto;
import model.umpramuitos.ItemPedido;
import model.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Adaga", 1100.00);
		ItemPedido item = new ItemPedido(pedido, produto, 3);
		
		dao
		.abrirT()
		.incluir(produto)
		.incluir(pedido)
		.incluir(item)
		.fecharT()
		.fechar();
	}
}

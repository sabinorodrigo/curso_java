package teste.umpraum;

import infra.DAO;
import model.umpraum.Assento;
import model.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getAssento().getNome());
		System.out.println(cliente.getAssento().getCliente().getNome());
		daoCliente.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(1L);
		
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();
	}
}

package teste.umpraum;

import infra.DAO;
import model.umpraum.Assento;
import model.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("23F");
		Cliente cliente = new Cliente("Bilbo", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(cliente)
		.incluir(assento)
		.fecharT()
		.fechar();
	}
}

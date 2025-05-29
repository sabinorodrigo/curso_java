package teste.muitospramuitos;

import infra.DAO;
import model.muitospramuitos.Sobrinho;
import model.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia1 = new Tio("Dark Magician Girl");
		Tio tio2 = new Tio("Dark Magician");
		
		Sobrinho sobrinho1 = new Sobrinho("Magician of Black Chaos");
		Sobrinho sobrinha2 = new Sobrinho("Magician's Valkyria");
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tia1);

		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT()
		.incluir(tia1)
		.incluir(tio2)
		.incluir(sobrinho1)
		.incluir(sobrinha2)
		.fecharT()
		.fechar();
	}
}

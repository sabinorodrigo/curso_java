package teste.muitospramuitos;

import infra.DAO;
import model.muitospramuitos.Ator;
import model.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars Ep 4", 8.9);
		Filme filmeB = new Filme("O Fugitivo", 8.1);
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.addAtor(atorA);
		filmeA.addAtor(atrizB);
		
		filmeB.addAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		dao.incluirAtomico(filmeB);
		
 	}
}

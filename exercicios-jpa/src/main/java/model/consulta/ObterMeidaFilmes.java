package model.consulta;

import infra.DAO;

public class ObterMeidaFilmes {

	public static void main(String[] args) {
		
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");
		
		System.out.println(nota.getMedia());
	}
}

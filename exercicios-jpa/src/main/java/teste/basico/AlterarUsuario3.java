package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 1L);
		em.detach(usuario);
		usuario.setNome("Gandalf");
		usuario.setEmail("gandalf@themagician.com");
		em.merge(usuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
}

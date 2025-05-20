package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("Gollum", "smeago@gollum.com");
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		System.out.println("O ID gerado para " + usuario.getNome() + " foi " + usuario.getId());
		
		em.close();
		emf.close();
	}
}

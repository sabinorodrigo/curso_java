package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.cards.Card;
import model.cards.CardFusion;

public class CardMain {

	public static void main(String[] args) {
		
		Card darkMagician = new Card(
				"Dark Magician", "Monster", "Dark", "Spellcaster/Normal", 7, 2500.00, 2100.00, 34433, "Unlimited");
		
		Card blueEyesUltimateDragon = new CardFusion(
				"Blue-Eyes Ultimate Dragon", 
				"Monster", 
				"Light", 
				"Dragon/Fusion", 
				12, 
				4500.00, 
				3800.00, 
				23995346,
				"Blue-Eyes White Dragon",
				"Blue-Eyes White Dragon + Blue-Eyes White Dragon + Blue-Eyes White Dragon", 
				"Unlimited");
		
		//System.out.println(darkMagician);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deck");
		EntityManager em  = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(blueEyesUltimateDragon);
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
		
	}


}

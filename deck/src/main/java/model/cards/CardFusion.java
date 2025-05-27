package model.cards;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class CardFusion extends Card{

	@Column(name = "fusion_material")
	private String fusionMaterial;
	
	@Column(name = "materials")
	private String materials;
	
	public CardFusion() {
	}
	
	public CardFusion(String name, String cardType, String attribute, 
			String types, int level, double attack, 
			double defense, int passcode, String fusionMaterial, String materials, String statuses) {
		this.setName(name);
		this.setCardType(cardType);
		this.setAttribute(attribute);
		this.setTypes(types);
		this.setLevel(level);
		this.setAttack(attack);
		this.setDefense(defense);
		this.setPasscode(passcode);
		this.setFusionMaterial(fusionMaterial);
		this.setMaterials(materials);
		this.setStatuses(statuses);
	}

	public String getFusionMaterial() {
		return fusionMaterial;
	}

	public void setFusionMaterial(String fusionMaterial) {
		this.fusionMaterial = fusionMaterial;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}
	
	
	
}

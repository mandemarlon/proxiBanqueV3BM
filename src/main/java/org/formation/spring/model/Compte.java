package org.formation.spring.model;

public abstract class Compte {
	
	private int numéroCompte;
	private double soldeCompte;
	private String typeCompte;
	
	
	
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	public Compte() {
		super();
	}
	
	public Compte(int numéroCompte, double soldeCompte, String typeCompte) {
		super();
		this.numéroCompte = numéroCompte;
		this.soldeCompte = soldeCompte;
		this.typeCompte = typeCompte;
	}
	public int getNuméroCompte() {
		return numéroCompte;
	}
	public void setNuméroCompte(int numéroCompte) {
		this.numéroCompte = numéroCompte;
	}
	public double getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	

	
}

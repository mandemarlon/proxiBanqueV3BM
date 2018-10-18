package org.formation.spring.model;

public class CompteCourant extends Compte{
	
	private int decouvert = 1000;
	
	private static final String COURANT = "COURANT";

	public CompteCourant(int decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	public static String getCourant() {
		return COURANT;
	}
	

	@Override
	public void setTypeCompte(String COURANT) {
		
		super.setTypeCompte(COURANT);
	}
	
	

}

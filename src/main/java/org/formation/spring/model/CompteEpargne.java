package org.formation.spring.model;

public class CompteEpargne extends Compte {
	
	
	private double txRem = 0.03;
	private static final String EPARGNE = "EPARGNE";
	
	
	
	public CompteEpargne(double txRem) {
		super();
		this.txRem = txRem;
	}



	public double getTxRem() {
		return txRem;
	}



	public void setTxRem(double txRem) {
		this.txRem = txRem;
	}



	public static String getEpargne() {
		return EPARGNE;
	}
	
	
	@Override
	public void setTypeCompte(String EPARGNE) {
		
		super.setTypeCompte(EPARGNE);
	}
	
	
	
	

}

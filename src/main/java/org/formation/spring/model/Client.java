package org.formation.spring.model;

import java.util.ArrayList;
import java.util.List;

public class Client {		
	
	private int id;
	private String nom ;
	private String prenom;
	private String adresse;
	
	private List<Compte> comptesClient = new ArrayList<>();
	private static int NbrMaxComptes = 2;
	
	
	
		
	public Client() {
		super();
	}
	public List<Compte> getComptesClient() {
		return comptesClient;
	}

	public void setComptesClient(List<Compte> comptesClient) {
		this.comptesClient = comptesClient;
	}

	public static int getNbrMaxComptes() {
		return NbrMaxComptes;
	}

	public Client(int id, String nom, String prenom, String adresse, List<Compte> comptesClient) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.comptesClient = comptesClient;
	}

	public static void setNbrMaxComptes(int nbrMaxComptes) {
		NbrMaxComptes = nbrMaxComptes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	

}

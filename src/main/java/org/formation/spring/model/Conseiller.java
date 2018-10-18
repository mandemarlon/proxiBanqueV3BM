package org.formation.spring.model;

import java.util.ArrayList;
import java.util.List;

public class Conseiller {

	private int id;
	private String nom;
	private String prenom;
	private String adresse;

	private List<Client> listClient = new ArrayList<>();
	private static int NbrMax = 10;

	public Conseiller(int id, String nom, String prenom, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public List<Client> getListClient() {
		return listClient;
	}

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}

	public static int getNbrMax() {
		return NbrMax;
	}

	public Conseiller() {
		super();
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

package com.bankonet.model;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private Adresse adresse;
	
	public Client(){}
	
	public Client(Adresse pAdresse){
		this.adresse=pAdresse;
		
	}
	
	public Client(int pId, String pNom, String pPrenom, Adresse pAdresse){
		this.id=pId;
		this.nom=pNom;
		this.prenom=pPrenom;
		this.adresse=pAdresse;
	}
	
	public int getId() {
		return id;
	}
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
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
	
	public String toString(){
		return "id : "+Integer.toString(getId())+
				", nom : "+getNom()+
				", prenom : "+getPrenom()+
				","+adresse.toString();
	}
	
}

package com.bankonet.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Client extends Personne{
	
	@Autowired
	private Adresse adresse;
	private String login;
	private String motDePasse;
	
	public Client(){}
	
	public Client(Adresse pAdresse){
		this.adresse=pAdresse;
		
	}
	
	public Client(int pId, String pNom, String pPrenom, Adresse pAdresse, String pLogin, String pMdp){
		super(pId,pNom,pPrenom);
		this.adresse=pAdresse;
		this.login=pLogin;
		this.motDePasse=pMdp;
	}
	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	
	
	public String toString(){
		return "id : "+Integer.toString(getId())+
				", nom : "+getNom()+
				", prenom : "+getPrenom()+
				", "+adresse.toString()+
				", "+getLogin()+
				", "+getMotDePasse();
	}
	
}

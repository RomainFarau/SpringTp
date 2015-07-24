package com.bankonet.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@DiscriminatorValue("C")
@Component("client")
@Scope("prototype")
public class Client extends Personne{
	
	@Autowired
	@Embedded
	private Adresse adresse;
	@NotNull
	@Size(min=2,max=16)
	private String login;
	@NotNull
	@Size(min=6,max=50)
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

package com.bankonet.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("personne")
@Scope("prototype")
public class Personne {
	private int id;
	private String nom;
	private String prenom;
	
	public Personne(){}
	
	public Personne(int pId, String pNom, String pPrenom){
		this.id=pId;
		this.nom=pNom;
		this.prenom=pPrenom;
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
}

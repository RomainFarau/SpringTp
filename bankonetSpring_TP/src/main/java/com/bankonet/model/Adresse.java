package com.bankonet.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("adresse")
@Scope("prototype")
public class Adresse {
	
	private int numero;
	private String rue;
	private String ville;
	
	public Adresse(){}
	
	public Adresse(int numero, String rue, String ville) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String toString(){
		return "num�ro : "+Integer.toString(getNumero())+
				", rue : "+getRue()+
				", ville : "+getVille();
	}
}

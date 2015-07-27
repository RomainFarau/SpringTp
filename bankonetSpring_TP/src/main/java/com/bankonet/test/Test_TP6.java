package com.bankonet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankonet.metier.IBankonetMetier;
import com.bankonet.model.Adresse;
import com.bankonet.model.Client;

public class Test_TP6 {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

		IBankonetMetier bankonetMetier = (IBankonetMetier) context.getBean("bankonetMetier");

		//bankonetMetier.addClient(new Client("martin","george",null,"geor","notablog"));
		//System.out.println(bankonetMetier.listClients());
		//bankonetMetier.addClient(new Client("toto","tata",new Adresse(36, "avenue Cyrnos", "Paris"),"log2","mdp2"));
		System.out.println(bankonetMetier.listClients());
	}

}

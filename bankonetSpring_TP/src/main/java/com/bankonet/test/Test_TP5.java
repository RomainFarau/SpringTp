package com.bankonet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankonet.metier.IBankonetMetier;



public class Test_TP5 {
	public static void main(String[] args){

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		IBankonetMetier bankonetMetier = (IBankonetMetier) context.getBean("bankonetMetier");
		
		bankonetMetier.listClients();
		bankonetMetier.SupprimerClientDontLeNomContient("hop");
	}
}

package com.bankonet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankonet.model.Client;

public class Test_TP4 {
	public static void main(String[] args){

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Client client = (Client) context.getBean("client");

		System.out.println(client.toString());
	}
}

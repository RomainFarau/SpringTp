package com.bankonet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankonet.metier.ReportService;

public class Test_TP2 {
	public static void main(String[] args){

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		 ReportService reportService1 = (ReportService) context.getBean("reportService");
		 ReportService reportService2 = (ReportService) context.getBean("reportService");
		 
		 reportService1.setAuteur("Martin");
		 reportService2.setAuteur("Rowling");
		 
		 reportService1.generate();
		 reportService2.generate();
	}
}

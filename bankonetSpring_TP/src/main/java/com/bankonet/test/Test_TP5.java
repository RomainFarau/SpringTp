package com.bankonet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankonet.metier.IReportService;
import com.bankonet.metier.ReportService;


public class Test_TP5 {
	public static void main(String[] args){

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		IReportService reportService = (ReportService) context.getBean("reportService");
		
		reportService.listClients();
	}
}

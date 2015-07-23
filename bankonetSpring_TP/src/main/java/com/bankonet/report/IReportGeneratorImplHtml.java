package com.bankonet.report;

public class IReportGeneratorImplHtml extends ReportGenerator implements IReportGenerator{

	public void generate() {
		System.out.println("Generation rapport html");
		
	}

	public void generate(String auteur) {
		this.generate();
		System.out.println("->Auteur : "+auteur);
	}

}

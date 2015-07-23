package com.bankonet.metier;

import com.bankonet.report.IReportGenerator;

public class ReportService {
	public IReportGenerator reportGenerator;

	public ReportService(){

	}
	
	public ReportService(IReportGenerator reportGenerator){
		this.reportGenerator=reportGenerator;
	}
	
	public IReportGenerator getReportGenerator() {
		return reportGenerator;
	}

	public void setReportGenerator(IReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	public void generate(){
		reportGenerator.generate();
	}
	
}

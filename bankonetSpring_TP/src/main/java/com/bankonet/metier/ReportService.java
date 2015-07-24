package com.bankonet.metier;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.bankonet.dao.ClientDaoImpl;
import com.bankonet.dao.IClientDao;
import com.bankonet.model.Client;
import com.bankonet.report.IReportGenerator;


@Service("reportService")
@Scope("prototype")
public class ReportService implements IReportService{
	
	@Resource(name="htmlReport")
	private IReportGenerator reportGenerator;
	
	private IClientDao clientDao;
	
	
	private String auteur;

	public ReportService(){
		clientDao=new ClientDaoImpl();
	}
	
	public ReportService(IReportGenerator reportGenerator){
		clientDao=new ClientDaoImpl();
		this.reportGenerator=reportGenerator;
	}
	
	public IReportGenerator getReportGenerator() {
		return reportGenerator;
	}

	public void setReportGenerator(IReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	public void generate(){
		reportGenerator.generate(auteur);
	}
	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void addClient(Client c) {
		clientDao.addClient(c);
	}

	public List<Client> listClients() {
		
		return clientDao.listClients();
	}

	public void deleteClient(int idClient) {
		clientDao.deleteClient(idClient);
	}

	public Client editClient(int idClient) {
		return clientDao.editClient(idClient);
	}

	public void updateClient(Client c) {
		clientDao.updateClient(c);
	}

	public List<Client> chercherClients(String motCle) {
		return clientDao.chercherClients(motCle);
	}
	
}

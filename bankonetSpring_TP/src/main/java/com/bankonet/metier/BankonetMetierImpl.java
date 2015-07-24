package com.bankonet.metier;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


import com.bankonet.dao.IClientDao;
import com.bankonet.model.Client;



@Service("bankonetMetier")
@Scope("prototype")
public class BankonetMetierImpl implements IBankonetMetier{
	
	@Resource(name="clientDao")
	private IClientDao clientDao;
	
	public BankonetMetierImpl(){
		
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

	@Override
	public List<Client> SupprimerClientDontLeNomContient(String mot_cle) {
		List<Client> clients= clientDao.chercherClients(mot_cle);
		if(clients!=null){
			for(Client client :clients){
				clientDao.deleteClient(client.getId());
			}
		}
		return clientDao.listClients();
	}
}

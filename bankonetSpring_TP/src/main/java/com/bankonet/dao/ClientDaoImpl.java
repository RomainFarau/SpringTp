package com.bankonet.dao;

import java.util.List;

import com.bankonet.model.Client;

public class ClientDaoImpl implements IClientDao{

	public void addClient(Client c) {
		System.out.println("Dans ClientDaoImpl.addClient : client ajout�!");
	}

	public List<Client> listClients() {
		System.out.println("Dans ClientDaoImpl.listClients : liste de clients retourn�e!");
		return null;
	}

	public void deleteClient(int idClient) {
		System.out.println("Dans ClientDaoImpl.deleteClient : client supprim�!");
		
	}

	public Client editClient(int idClient) {
		System.out.println("Dans ClientDaoImpl.editClient : client modifi�!");
		return null;
	}

	public void updateClient(Client c) {
		System.out.println("Dans ClientDaoImpl.updateClient : client modifi�!");
		
	}

	public List<Client> chercherClients(String motCle) {
		System.out.println("Dans ClientDaoImpl.chercherClients : recherche de client en cours!");
		return null;
	}

}

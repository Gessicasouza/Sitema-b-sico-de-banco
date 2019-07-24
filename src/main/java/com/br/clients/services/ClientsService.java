package com.br.clients.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.clients.models.ClientsModel;
import com.br.clients.repositories.ClientsRepository;

@Service
public class ClientsService {

	@Autowired
	private ClientsRepository clientsRepository;
	
	public Iterable<ClientsModel> showAll(){
		return clientsRepository.findAll();
	}
	
}

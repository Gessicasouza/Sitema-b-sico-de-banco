package com.br.clients.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.clients.models.ClientsModel;
import com.br.clients.models.accountModel;
import com.br.clients.repositories.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public String saveAccount(ClientsModel clientsModel, accountModel accountModel) {
		accountModel.setClientsModel(clientsModel);
		accountRepository.save(accountModel);

		return "Been successfully archieved";
	}

	public Iterable<accountModel> showAllAccounts() {
		return accountRepository.findAll();
	}

}

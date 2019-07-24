package com.br.clients.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMin;

@Entity
public class accountModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@DecimalMin(value = "100,0", message = "Account must have at least 100 reais to create")
	private double balanceSavingsAccount;

	@DecimalMin(value = "100,0", message = "Account must have at least 100 reais to create")
	private double balanceCurrentAccount;

	public accountModel() {

	}

	@OneToOne(cascade = { CascadeType.ALL })
	private ClientsModel clientsModel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getBalanceSavingsAccount() {
		return balanceSavingsAccount;
	}

	public void setBalanceSavingsAccount(double balanceSavingsAccount) {
		this.balanceSavingsAccount = balanceSavingsAccount;
	}

	public double getBalanceCurrentAccount() {
		return balanceCurrentAccount;
	}

	public void setBalanceCurrentAccount(double balanceCurrentAccount) {
		this.balanceCurrentAccount = balanceCurrentAccount;
	}

	public ClientsModel getClientsModel() {
		return clientsModel;
	}

	public void setClientsModel(ClientsModel clientsModel) {
		this.clientsModel = clientsModel;
	}

	


}

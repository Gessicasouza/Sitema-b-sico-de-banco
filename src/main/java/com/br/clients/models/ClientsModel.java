package com.br.clients.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class ClientsModel implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "First name required.")
	private String name;
	
	@NotBlank(message = "Cpf (Required)")
    @Size(min = 11, max = 11, message = "CPF Invalid")
	private String cpf;
	
	@NotBlank(message = "Phone number required.")
	@Size(min = 9, max = 15 , message = "Invalid phone number")
	private String phoneNumber;
	

	public ClientsModel() {
		
	}
	
	@OneToOne(mappedBy = "clients")
	private accountModel accountModel;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

	
	
}

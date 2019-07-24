package com.br.clientes.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class ClienteModel implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Nome obrigatório")
	private String nome;
	
	@NotBlank(message = "Cpf obrigatório!")
    @Size(min = 11, max = 11, message = "CPF INVALIDO")
	private String cpf;
	
	@NotBlank(message = "Numero obrigatório")
	private String numeroDeTelefone;

}

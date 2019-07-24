package com.br.clients.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.clients.models.ClientsModel;

@Repository
public interface ClientsRepository extends CrudRepository<ClientsModel, Integer> {

}

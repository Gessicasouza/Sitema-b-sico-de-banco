package com.br.clients.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.clients.models.accountModel;

@Repository
public interface AccountRepository extends CrudRepository<accountModel, Integer> {

}

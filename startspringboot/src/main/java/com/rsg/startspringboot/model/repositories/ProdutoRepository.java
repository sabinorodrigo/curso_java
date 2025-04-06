package com.rsg.startspringboot.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rsg.startspringboot.model.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}

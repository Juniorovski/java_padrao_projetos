package com.JuniorMelo.ecomerce.service;

import com.JuniorMelo.ecomerce.model.Produto;
import com.JuniorMelo.ecomerce.repository.Produto_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Produto_Service {
    private Produto_Repository produto_repository;
    public Produto_Service(Produto_Repository produto_repository) {
        this.produto_repository = produto_repository;
    }
    public List<Produto> create(Produto produto){
       produto_repository.save(produto);
       return reader();
    }
    public List<Produto> reader(){
        return   produto_repository.findAll();

    }
    public List<Produto> update(Produto produto){
        produto_repository.save(produto);
        return reader();
    }
    public List<Produto> delete(Long id){
        produto_repository.deleteById(id);
        return reader();
    }
}

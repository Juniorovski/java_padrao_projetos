package com.JuniorMelo.ecomerce.controller;

import com.JuniorMelo.ecomerce.model.Produto;
import com.JuniorMelo.ecomerce.service.Produto_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class Produto_Controller {
    private Produto_Service produto_service;

    public Produto_Controller(Produto_Service produto_service) {
        this.produto_service = produto_service;
    }
    @PostMapping
    List<Produto> save( @RequestBody  Produto produto){
        return produto_service.create(produto);
    }

    @GetMapping
    List<Produto>read(){
       return produto_service.reader();
    }
    @PutMapping
    List<Produto> update (@RequestBody Produto produto){
       return produto_service.update(produto);
    }
    @DeleteMapping("{id}")
    List<Produto> delete (@PathVariable("id") Long id){
       return produto_service.delete(id);
    }
}

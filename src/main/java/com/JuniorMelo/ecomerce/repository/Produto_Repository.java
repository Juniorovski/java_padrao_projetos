package com.JuniorMelo.ecomerce.repository;

import com.JuniorMelo.ecomerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Produto_Repository extends JpaRepository<Produto,Long> {
}

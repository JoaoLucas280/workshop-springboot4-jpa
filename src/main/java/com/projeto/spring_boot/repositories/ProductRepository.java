package com.projeto.spring_boot.repositories;

import com.projeto.spring_boot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

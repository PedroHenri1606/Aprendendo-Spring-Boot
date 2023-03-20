package com.projetoSpring.projetoCurso.repositories;

import com.projetoSpring.projetoCurso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

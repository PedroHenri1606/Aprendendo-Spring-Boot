package com.projetoSpring.projetoCurso.repositories;

import com.projetoSpring.projetoCurso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{

}

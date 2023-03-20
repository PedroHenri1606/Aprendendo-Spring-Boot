package com.projetoSpring.projetoCurso.repositories;

import com.projetoSpring.projetoCurso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}

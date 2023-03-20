package com.projetoSpring.projetoCurso.repositories;

import com.projetoSpring.projetoCurso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

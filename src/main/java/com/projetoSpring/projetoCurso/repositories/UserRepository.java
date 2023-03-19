package com.projetoSpring.projetoCurso.repositories;

import com.projetoSpring.projetoCurso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}

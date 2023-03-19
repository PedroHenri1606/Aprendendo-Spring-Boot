package com.projetoSpring.projetoCurso.resource;


import com.projetoSpring.projetoCurso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Pedro Henrique","pedrohenri1606@gmail.com","45 998265476d","5476");
        return ResponseEntity.ok().body(u);
    }
}

package com.projetoSpring.projetoCurso.services;

import com.projetoSpring.projetoCurso.entities.Category;
import com.projetoSpring.projetoCurso.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){ return repository.findAll();}

    public Category findById(long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

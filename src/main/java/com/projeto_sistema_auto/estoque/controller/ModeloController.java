package com.projeto_sistema_auto.estoque.controller;

import com.projeto_sistema_auto.estoque.model.Modelo;
import com.projeto_sistema_auto.estoque.repository.ModeloRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    private final ModeloRepository repository;

    public ModeloController(ModeloRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Modelo criar(@RequestBody Modelo modelo) {
        return repository.save(modelo);
    }

    @GetMapping
    public List<Modelo> listar() {
        return repository.findAll();
    }
}
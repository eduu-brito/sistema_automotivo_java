package com.projeto_sistema_auto.estoque.controller;

import com.projeto_sistema_auto.estoque.model.Marca;
import com.projeto_sistema_auto.estoque.repository.MarcaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    private final MarcaRepository repository;

    public MarcaController(MarcaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Marca criar(@RequestBody Marca marca) {
        return repository.save(marca);
    }

    @GetMapping
    public List<Marca> listar() {
        return repository.findAll();
    }
}

package com.projeto_sistema_auto.estoque.controller;

import com.projeto_sistema_auto.estoque.model.Veiculo;
import com.projeto_sistema_auto.estoque.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    @PostMapping
    public Veiculo criar(@RequestBody Veiculo veiculo) {
        return service.salvar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        return service.atualizar(id, veiculo);
    }

    @GetMapping("/marca")
    public List<Veiculo> buscarPorMarca(@RequestParam String marca) {
        return service.buscarPorMarca(marca);
    }

    @GetMapping("/preco")
    public List<Veiculo> buscarPorPreco(@RequestParam double preco) {
        return service.buscarPorPreco(preco);
    }

    @GetMapping("/modelo")
    public List<Veiculo> buscarPorModelo(@RequestParam String modelo) {
        return service.buscarPorModelo(modelo);
    }

    @GetMapping("/preco-faixa")
    public List<Veiculo> buscarPorFaixaPreco(
            @RequestParam double min,
            @RequestParam double max) {

        return service.buscarPorFaixaPreco(min, max);
    }

    
}
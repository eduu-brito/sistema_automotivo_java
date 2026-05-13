package com.projeto_sistema_auto.estoque.service;

import com.projeto_sistema_auto.estoque.model.Veiculo;
import com.projeto_sistema_auto.estoque.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository repository;

    public VeiculoService(VeiculoRepository repository) {
        this.repository = repository;
    }

    public Veiculo salvar(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public List<Veiculo> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public List<Veiculo> buscarPorMarca(String marca) {
        return repository.findByMarca_Nome(marca);
    }

    public List<Veiculo> buscarPorModelo(String modelo) {
        return repository.findByModelo_Nome(modelo);
    }

    public List<Veiculo> buscarPorPreco(double preco) {
        return repository.findByPrecoLessThan(preco);
    }

    public List<Veiculo> buscarPorFaixaPreco(double min, double max) {
        return repository.findByPrecoBetween(min, max);
    }

    public Veiculo atualizar(Long id, Veiculo novoVeiculo) {
        Veiculo veiculo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        veiculo.setModelo(novoVeiculo.getModelo());
        veiculo.setMarca(novoVeiculo.getMarca());
        veiculo.setAno(novoVeiculo.getAno());
        veiculo.setCor(novoVeiculo.getCor());
        veiculo.setPreco(novoVeiculo.getPreco());
        veiculo.setQuilometragem(novoVeiculo.getQuilometragem());
        veiculo.setStatus(novoVeiculo.getStatus());

        return repository.save(veiculo);
    }
}
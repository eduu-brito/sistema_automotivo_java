package com.projeto_sistema_auto.estoque.repository;

import com.projeto_sistema_auto.estoque.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByMarca_Nome(String nome);

    List<Veiculo> findByPrecoLessThan(double preco);

    List<Veiculo> findByModelo_Nome(String nome);

    List<Veiculo> findByPrecoBetween(double min, double max);

    List<Veiculo> findByAno(int ano);

    List<Veiculo> findByStatus(String status);




}

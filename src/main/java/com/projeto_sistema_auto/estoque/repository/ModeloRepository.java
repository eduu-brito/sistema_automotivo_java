package com.projeto_sistema_auto.estoque.repository;

import com.projeto_sistema_auto.estoque.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}

package com.projeto_sistema_auto.estoque.repository;

import com.projeto_sistema_auto.estoque.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
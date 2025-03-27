package com.example.exercicio01_sprint2.exercicio01.repository;

import com.example.exercicio01_sprint2.exercicio01.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryFatura extends JpaRepository<Fatura, Long> {
    Long id(Long id);
}

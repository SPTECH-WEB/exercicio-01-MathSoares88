package com.example.exercicio01_sprint2.exercicio01.service;

import com.example.exercicio01_sprint2.exercicio01.model.Fatura;
import com.example.exercicio01_sprint2.exercicio01.repository.RepositoryFatura;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceFatura {
    private final RepositoryFatura repositoryFatura;
    public ServiceFatura(RepositoryFatura repositoryFatura) {
        this.repositoryFatura = repositoryFatura;
    }

    public List<Fatura> listarTodos(){
        return repositoryFatura.findAll();
    }


    public Fatura salvar(Fatura fatura){
        return repositoryFatura.save(fatura);
    }
}


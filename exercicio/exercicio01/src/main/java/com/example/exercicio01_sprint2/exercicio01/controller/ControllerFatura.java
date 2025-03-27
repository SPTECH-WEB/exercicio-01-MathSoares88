package com.example.exercicio01_sprint2.exercicio01.controller;

import com.example.exercicio01_sprint2.exercicio01.model.Fatura;
import com.example.exercicio01_sprint2.exercicio01.repository.RepositoryFatura;
import com.example.exercicio01_sprint2.exercicio01.service.ServiceFatura;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class ControllerFatura {
    private final ServiceFatura serviceFatura;

    public ControllerFatura(ServiceFatura serviceFatura) {
        this.serviceFatura = serviceFatura;
    }

    @GetMapping
    public List<Fatura> listarFatura(){
        return serviceFatura.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Fatura>criar(@Valid @RequestBody Fatura fatura){
        Fatura novaFatura = serviceFatura.salvar(fatura);
        return ResponseEntity.ok(novaFatura);
    }

}

package com.example.demo.controller;


import com.example.demo.model.Aluno;

import com.example.demo.repository.AlunoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class AlunoController {
    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
        alunoRepository.saveAll(List.of(
                new Aluno("Vicenzo", "060250670-07", "viti@ufn.edu.br"),
                new Aluno("Iago", "685924834-97", "iago@ufn.edu.br"),
                new Aluno("Matheus", "283945721-23", "matheus@ufn.edu.br"),
                new Aluno("Gilberto", "298529102-02", "gilberto@ufn.edu.br")
        ));
    }

    @GetMapping("/alunos")
    Iterable<Aluno> alunos() {
        return alunoRepository.findAll();
    }
}




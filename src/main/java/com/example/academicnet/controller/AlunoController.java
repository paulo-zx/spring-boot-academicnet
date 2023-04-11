package com.example.academicnet.controller;

import com.example.academicnet.modelo.Aluno;
import com.example.academicnet.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @GetMapping
    public List<Aluno> listar(){
        return alunoRepositorio.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Aluno aluno){
        alunoRepositorio.save(aluno);
    }

    @PutMapping
    public void alterar(@RequestBody Aluno aluno){
        alunoRepositorio.save(aluno);
    }

    @DeleteMapping("/{matricula}")
    public void deletar(@PathVariable Long matricula){
        alunoRepositorio.deleteById(matricula);
    }

    @GetMapping("{matricula}")
    public Optional<Aluno> ler(@PathVariable Long matricula){
        return alunoRepositorio.findById(matricula);
    }

}

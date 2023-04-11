package com.example.academicnet.repositorio;

import com.example.academicnet.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno,Long> {
}

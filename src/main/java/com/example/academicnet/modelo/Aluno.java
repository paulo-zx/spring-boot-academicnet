package com.example.academicnet.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aluno {

    @Id
    private Long matricula;
    private String nome;
    private String telefone;
    private String email;

    private Instant dataCadastro;

}

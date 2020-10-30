package com.example.alpooproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

@Entity
public class Aluno {



    private UUID matricula;
    private final String nome;
    private final Date dataNasc;
    private final Integer codCurso;
    private final String nomeCurso;


    public Aluno(
                 UUID matricula,
                 @JsonProperty("nome") String nome,
                 @JsonProperty("dataNasc") Date dataNasc,
                 @JsonProperty("codCurso") Integer codCurso,
                 @JsonProperty("nomeCurso") String nomeCurso) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.codCurso = codCurso;
        this.nomeCurso = nomeCurso;

    }

    public UUID getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setMatricula(UUID matricula) {
        this.matricula = matricula;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", dataNasc=" + dataNasc +
                ", codCurso=" + codCurso +
                ", nomeCurso='" + nomeCurso + '\'' +
                '}';
    }
}

/*Matricula, Nome, DataNasc. CodCurso, NomeCurso,
(List com CodDisciplina, NomeDisciplina), Nota NP1, Nota NP2, Média, Faltas.*/
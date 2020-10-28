package com.example.alpooproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.UUID;

public class Aluno {

    private final UUID matricula;
    private final String nome;
    private final Date dataNasc;
    private final Integer codCurso;
    private final String nomeCurso;
    private final Integer np1;
    private final Integer np2;
    private final Integer media;
    private final Integer faltas;

    public Aluno(@JsonProperty("matricula") UUID matricula,
                 @JsonProperty("nome") String nome,
                 @JsonProperty("dataNasc") Date dataNasc,
                 @JsonProperty("codCurso") Integer codCurso,
                 @JsonProperty("nomeCurso") String nomeCurso,
                 @JsonProperty("np1") Integer np1,
                 @JsonProperty("np2") Integer np2,
                 @JsonProperty("media") Integer media,
                 @JsonProperty("faltas") Integer faltas) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.codCurso = codCurso;
        this.nomeCurso = nomeCurso;
        this.np1 = np1;
        this.np2 = np2;
        this.media = media;
        this.faltas = faltas;

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

    public Integer getNp1() {
        return np1;
    }

    public Integer getNp2() {
        return np2;
    }

    public Integer getMedia() {
        return media;
    }

    public Integer getFaltas() {
        return faltas;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", dataNasc=" + dataNasc +
                ", codCurso=" + codCurso +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", np1=" + np1 +
                ", np2=" + np2 +
                ", media=" + media +
                ", faltas=" + faltas +
                '}';
    }
}

/*Matricula, Nome, DataNasc. CodCurso, NomeCurso,
(List com CodDisciplina, NomeDisciplina), Nota NP1, Nota NP2, Média, Faltas.*/
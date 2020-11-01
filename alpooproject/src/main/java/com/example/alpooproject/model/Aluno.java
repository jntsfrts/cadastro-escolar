package com.example.alpooproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_matricula")
    private Long matricula;

    @Column(name = "nm_aluno")
    private String nome;

    @Column(name = "dt_nascimento")
    private Date dataNasc;

    @Column(name = "cd_curso")
    private Integer codCurso;

    @Column(name = "nm_curso")
    private String nomeCurso;

    @Column(name = "nota_np1")
    private int notaNp1;

    @Column(name = "nota_np2")
    private int notaNp2;


    public Long getMatricula() {
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

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public int getNotaNp1() {
        return notaNp1;
    }

    public int getNotaNp2() {
        return notaNp2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", dataNasc=" + dataNasc +
                ", codCurso=" + codCurso +
                ", nomeCurso='" + nomeCurso +
                "notaNp1=" + notaNp1 +
                "notaNp2=" + notaNp2 +
                '\'' +
                '}';
    }
}

/*Matricula, Nome, DataNasc. CodCurso, NomeCurso,
(List com CodDisciplina, NomeDisciplina), Nota NP1, Nota NP2, Média, Faltas.*/
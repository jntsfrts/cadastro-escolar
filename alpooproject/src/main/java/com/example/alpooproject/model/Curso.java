package com.example.alpooproject.model;

import javax.persistence.*;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cd_curso")
    private Long codCurso;

    @Column(name = "nm_curso")
    private String nomeCurso;

    @Column(name = "tp_curso")
    private String tipoCurso;

    @Column(name = "dc_carga_horaria")
    private int cargaHoraria;

    @Column(name = "cd_instituto")
    private int codInstituto;


    public Long getCodCurso() {
        return codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getCodInstituto() {
        return codInstituto;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codCurso=" + codCurso +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", tipoCurso='" + tipoCurso + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", codInstituto=" + codInstituto +
                '}';
    }

}

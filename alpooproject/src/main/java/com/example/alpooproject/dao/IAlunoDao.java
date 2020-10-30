package com.example.alpooproject.dao;

import com.example.alpooproject.model.Aluno;

import java.util.List;
import java.util.UUID;

public interface IAlunoDao {

    public List<Aluno> getAllAlunos();

    public void insertAluno(Aluno aluno);

    public void deleteAlunoById(UUID matricula);
}

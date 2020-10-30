package com.example.alpooproject.dao.impl;

import com.example.alpooproject.dao.IAlunoDao;
import com.example.alpooproject.model.Aluno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class AlunoDao implements IAlunoDao {

    List<Aluno> db = new ArrayList<>();

    public List<Aluno> getAllAlunos() {
        return db;
    }

    public void insertAluno(Aluno aluno) {
        db.add(aluno);
    }

    public void deleteAlunoById(UUID matricula) {
    }
}

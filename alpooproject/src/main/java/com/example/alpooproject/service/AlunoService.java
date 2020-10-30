package com.example.alpooproject.service;

import com.example.alpooproject.dao.impl.AlunoDao;
import com.example.alpooproject.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.UUID;

@Service
public class AlunoService {

    private final AlunoDao alunoDao;

    @Autowired
    public AlunoService(@Qualifier("fakeDao") AlunoDao alunoDao) {
        this.alunoDao = alunoDao;
    }

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoDao.getAllAlunos();
    }

    @PostMapping
    public void addNewAluno(Aluno aluno) {
        aluno.setMatricula(UUID.randomUUID());
        System.out.println(aluno.getMatricula());
        alunoDao.insertAluno(aluno);
    }

    public void deleteAluno(UUID matricula) {
        alunoDao.deleteAlunoById(matricula);
    }

    public void updateAluno() {
    }
}

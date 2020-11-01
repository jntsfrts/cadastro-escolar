package com.example.alpooproject.service;

import com.example.alpooproject.dao.AlunoRepository;
import com.example.alpooproject.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class AlunoService {

    private final AlunoRepository alunoDao;

    @Autowired
    public AlunoService(AlunoRepository alunoDao) {
        this.alunoDao = alunoDao;
    }

    public ResponseEntity<?> getAllAlunos() {
        return new ResponseEntity<>(alunoDao.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> findByMatricula(@PathVariable(value = "matricula") Long matricula) {
        return new ResponseEntity<>(alunoDao.findByMatricula(matricula), HttpStatus.OK);
    }

    public ResponseEntity<?> addNewAluno(@RequestBody Aluno aluno) {
        System.out.println(aluno.getMatricula());
        return new ResponseEntity<>(alunoDao.save(aluno), HttpStatus.OK);
    }

    public ResponseEntity<?> deleteAluno(@PathVariable Long matricula) {
        alunoDao.deleteById(matricula);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    public ResponseEntity<?> updateAluno(@RequestBody Aluno aluno) {
        alunoDao.save(aluno);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

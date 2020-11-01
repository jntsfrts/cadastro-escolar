package com.example.alpooproject.service;


import com.example.alpooproject.dao.CursoRepository;
import com.example.alpooproject.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CursoService {

    private final CursoRepository cursoDao;

    @Autowired
    public CursoService(CursoRepository cursoDao) {
        this.cursoDao = cursoDao;
    }

    public ResponseEntity<?> getAllCursos() {
        return new ResponseEntity<>(cursoDao.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> addNewCurso(@RequestBody Curso curso) {
        return new ResponseEntity<>(cursoDao.save(curso), HttpStatus.OK);
    }

    public ResponseEntity<?> deleteCurso(@PathVariable Long matricula) {
        cursoDao.deleteById(matricula);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    public ResponseEntity<?> updateCurso(@RequestBody Curso curso) {
        cursoDao.save(curso);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

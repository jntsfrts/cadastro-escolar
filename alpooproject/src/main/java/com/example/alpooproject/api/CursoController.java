package com.example.alpooproject.api;

import com.example.alpooproject.model.Curso;
import com.example.alpooproject.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class CursoController {

    public final CursoService cursoService;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/cursos")
    public ResponseEntity<?> getAllCursos() {
        return cursoService.getAllCursos();
    }

    @PostMapping("/cursos")
    public ResponseEntity<?> addNewCurso(@RequestBody Curso curso) {
        return new ResponseEntity<>(cursoService.addNewCurso(curso), HttpStatus.OK);
    }

    @DeleteMapping("/cursos/{codCurso}")
    public ResponseEntity<?> deleteCurso(@PathVariable Long matricula) {
        cursoService.deleteCurso(matricula);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @PutMapping("/cursos/{codCurso}")
    public ResponseEntity<?> updateCurso(@RequestBody Curso curso) {
        cursoService.addNewCurso(curso);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

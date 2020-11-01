package com.example.alpooproject.api;

import com.example.alpooproject.model.Aluno;
import com.example.alpooproject.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1")
@RestController
public class AlunoController {

    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/alunos")
    public ResponseEntity<?> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @GetMapping(path = "/alunos/{matricula}")
    public ResponseEntity<?> findAlunoByMatricula(@PathVariable(value = "matricula") Long matricula) {
        return new ResponseEntity<>(alunoService.findByMatricula(matricula), HttpStatus.OK);
    }

    @PostMapping("/alunos")
    public void addAluno(@RequestBody Aluno aluno) {
        alunoService.addNewAluno(aluno);
    }

    @PutMapping("/alunos/{matricula}")
    public void updateAluno(@RequestBody Aluno aluno) {
        alunoService.updateAluno(aluno);
    }

    @DeleteMapping("/alunos/{matricula}")
    public void deleteAluno(@PathVariable("matricula") Long matricula) {
        alunoService.deleteAluno(matricula);
    }
}

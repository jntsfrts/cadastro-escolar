package com.example.alpooproject.api;

import com.example.alpooproject.model.Aluno;
import com.example.alpooproject.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/cadastrar/aluno")
@RestController
public class AlunoController {

    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @PostMapping
    public void addAluno(@RequestBody Aluno aluno) {
        alunoService.addNewAluno(aluno);
    }

    @PutMapping
    public void updateAluno(@PathVariable("matricula") UUID matricula,
                            @RequestBody Aluno aluno) {
        alunoService.updateAluno();
    }

    @DeleteMapping
    public void deleteAluno(@PathVariable("matricula") UUID matricula) {
        alunoService.deleteAluno(matricula);
    }
}

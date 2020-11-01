package com.example.alpooproject.dao;

import com.example.alpooproject.model.Aluno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    List<Aluno> findByMatricula(Long matricula);
}

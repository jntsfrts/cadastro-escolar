package com.example.alpooproject.dao;

import com.example.alpooproject.model.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long> {
    List<Curso> findCursoByCodCurso(Long codCurso);
}










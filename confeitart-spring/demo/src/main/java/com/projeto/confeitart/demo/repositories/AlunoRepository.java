package com.projeto.confeitart.demo.repositories;

import com.projeto.confeitart.demo.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
   // void delete(Long id);
}

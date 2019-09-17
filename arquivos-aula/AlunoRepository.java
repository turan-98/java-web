package com.fatec.scel.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
	@Query("SELECT l FROM Livro l WHERE l.ra = :ra")
	public Aluno findByIsbn(@Param("ra") Long ra);
}

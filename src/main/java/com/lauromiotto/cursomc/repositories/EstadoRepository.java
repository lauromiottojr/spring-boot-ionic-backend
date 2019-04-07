package com.lauromiotto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauromiotto.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> { // tipo do objeto e o tipo do identificador dele, no caso o ID
	// com essa classe vazia, herdando(extends) do JpaRepository, ela ja consegue um CRUD
}

package com.lauromiotto.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauromiotto.cursomc.domain.Categoria;
import com.lauromiotto.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired // automaticamente instancia a classe CategoriaRepository, repo...
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}

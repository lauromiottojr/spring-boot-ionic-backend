package com.lauromiotto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauromiotto.cursomc.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> { // tipo do objeto e o tipo do identificador dele, no caso o ID
	// com essa classe vazia, herdando(extends) do JpaRepository, ela ja consegue um CRUD
}

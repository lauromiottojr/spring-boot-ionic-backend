package com.lauromiotto.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lauromiotto.cursomc.domain.Cliente;
import com.lauromiotto.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET) // metodo GET por padrão para listar, para cadastrar POST, para deletar DELETE
	// value para que se tiver um id dps de categorias na url, ele entra nesse metodo
	public ResponseEntity<Cliente> find(@PathVariable Integer id) { // anotação para vincular o valor q vem da url nesse id
		Cliente obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}

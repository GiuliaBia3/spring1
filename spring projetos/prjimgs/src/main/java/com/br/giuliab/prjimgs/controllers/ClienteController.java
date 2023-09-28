package com.br.giuliab.prjimgs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.giuliab.prjimgs.entities.Cliente;
import com.br.giuliab.prjimgs.service.Clienteservice;



@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private final Clienteservice clienteService;

	@Autowired
	public  ClienteController(Clienteservice clienteService) {
		this.clienteService = clienteService;
	}

	@PostMapping
	public Cliente creatCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}

	@GetMapping("/{idcCliente}")
	public Cliente getCliente(@PathVariable Long id) {
		return (Cliente) clienteService.getAllCliente();
	}

	@GetMapping
	public List<Cliente> getAllCliente() {
		return clienteService.getAllCliente();
	}

	@DeleteMapping("/{idcCliente}")
	public void deleteProduto(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);		
	}

}

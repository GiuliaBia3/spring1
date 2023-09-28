package com.br.giuliab.prjimgs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.giuliab.prjimgs.entities.Cliente;
import com.br.giuliab.prjimgs.repository.Clienterepository;

@Service
public class Clienteservice {
	private final Clienterepository clienteRepository;

	@Autowired
	public Clienteservice(Clienterepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	public List <Cliente> getAllCliente(){
    return clienteRepository.findAll();
	}
	public Cliente getClienteById (Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
		
	}
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
	
}

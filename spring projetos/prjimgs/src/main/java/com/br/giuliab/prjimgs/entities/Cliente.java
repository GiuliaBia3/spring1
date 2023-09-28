package com.br.giuliab.prjimgs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_nCliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;

	@Column(name = "nCliente")
	private String nCliente;

	@Column(name = "fone")
	private String fone;

	public Cliente() {
	}

	public Cliente(Long idcCliente, String nCliente, String fone) {

		this.idcCliente = idcCliente;
		this.nCliente = nCliente;
		this.fone = fone;
	}

	public Long getId() {
		return idcCliente;
	}

	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getCliente() {
		return getCliente();

	}

	public void setName(String fone) {
		this.fone = fone;
	}

}
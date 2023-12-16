package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

public class SenderDTO implements Serializable {
	private static final long serialVersionUID = -6077524143056052745L;
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private PhoneDTO telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PhoneDTO getTelefone() {
		return telefone;
	}

	public void setTelefone(PhoneDTO telefone) {
		this.telefone = telefone;
	}
	
	
}

package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class HolderDTO implements Serializable {
	private static final long serialVersionUID = 4200380098214192698L;
	private String nome;
	private Date dataAniversario;
	private PhoneDTO telefone;
	
	private List<DocumentHolderDTO> documentos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public PhoneDTO getTelefone() {
		return telefone;
	}

	public void setTelefone(PhoneDTO telefone) {
		this.telefone = telefone;
	}

	public List<DocumentHolderDTO> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<DocumentHolderDTO> documentos) {
		this.documentos = documentos;
	}
	
	
}

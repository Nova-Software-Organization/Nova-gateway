package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import org.w3c.dom.DocumentType;

public class DocumentHolderDTO implements Serializable {
	private static final long serialVersionUID = 403327550741362612L;
	private DocumentType tipo;
	private String valor;

	public DocumentType getTipo() {
		return tipo;
	}

	public void setTipo(DocumentType tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}

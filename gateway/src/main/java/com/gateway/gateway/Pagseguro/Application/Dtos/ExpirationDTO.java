package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

public class ExpirationDTO implements Serializable {
	private static final long serialVersionUID = -9204368499838009459L;
	private Integer valor;
	private String unidade;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getUnidade() {
		return unidade;
	}
    
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	

}

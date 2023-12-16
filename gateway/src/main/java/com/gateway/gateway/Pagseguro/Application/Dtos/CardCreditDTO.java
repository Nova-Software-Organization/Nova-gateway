package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

public class CardCreditDTO implements Serializable {
	private static final long serialVersionUID = -6666112398025610290L;
	private String token;
	private HolderDTO titular;
	private AddressDTO enderecoCobranca;
	private InstallmentDTO prestacao;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public HolderDTO getTitular() {
		return titular;
	}

	public void setTitular(HolderDTO titular) {
		this.titular = titular;
	}

	public AddressDTO getEnderecoCobranca() {
		return enderecoCobranca;
	}

	public void setEnderecoCobranca(AddressDTO enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}

	public InstallmentDTO getPrestacao() {
		return prestacao;
	}

	public void setPrestacao(InstallmentDTO prestacao) {
		this.prestacao = prestacao;
	}
	
}

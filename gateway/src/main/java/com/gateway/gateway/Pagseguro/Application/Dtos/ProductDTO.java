package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 5705849221618687589L;
	private Long id;
	private String descricao;
	private BigDecimal preco;
	private Integer quantidade;
	private Integer peso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	

}

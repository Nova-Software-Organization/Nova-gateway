package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

public class PaymentDTO implements Serializable{
	private static final long serialVersionUID = -1396721669039004741L;
	private Long id;
	private Currency moeda;
	private BigDecimal precoExtra;
	private String referencia;
	private SenderDTO remetente;
	private ShippingDTO remessa;
	private List<ProductDTO> produtos;
	private CardCreditDTO cartaoCredito;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Currency getMoeda() {
		return moeda;
	}

	public void setMoeda(Currency moeda) {
		this.moeda = moeda;
	}

	public BigDecimal getPrecoExtra() {
		return precoExtra;
	}

	public void setPrecoExtra(BigDecimal precoExtra) {
		this.precoExtra = precoExtra;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public SenderDTO getRemetente() {
		return remetente;
	}

	public void setRemetente(SenderDTO remetente) {
		this.remetente = remetente;
	}

	public ShippingDTO getRemessa() {
		return remessa;
	}

	public void setRemessa(ShippingDTO remessa) {
		this.remessa = remessa;
	}

	public List<ProductDTO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProductDTO> produtos) {
		this.produtos = produtos;
	}

	public CardCreditDTO getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(CardCreditDTO cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
}

package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class PreAprovadDTO implements Serializable {
	private static final long serialVersionUID = 4682399098505830831L;
	private String redirecionaURL;
	private String notificacaoRL;
	private Currency moeda;
	private BigDecimal precoExtra;
	private String referencia;
	private ShippingDTO remessa;
	private SenderDTO remetente;
	private RequestPreAprovadDTO requisicao;
	private Map<String, String> parametros = new HashMap<String, String>();
	
	public String getRedirecionaURL() {
		return redirecionaURL;
	}

	public void setRedirecionaURL(String redirecionaURL) {
		this.redirecionaURL = redirecionaURL;
	}

	public String getNotificacaoRL() {
		return notificacaoRL;
	}

	public void setNotificacaoRL(String notificacaoRL) {
		this.notificacaoRL = notificacaoRL;
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

	public ShippingDTO getRemessa() {
		return remessa;
	}

	public void setRemessa(ShippingDTO remessa) {
		this.remessa = remessa;
	}

	public SenderDTO getRemetente() {
		return remetente;
	}

	public void setRemetente(SenderDTO remetente) {
		this.remetente = remetente;
	}

	public RequestPreAprovadDTO getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(RequestPreAprovadDTO requisicao) {
		this.requisicao = requisicao;
	}

	public Map<String, String> getParametros() {
		return parametros;
	}

	public void setParametros(Map<String, String> parametros) {
		this.parametros = parametros;
	}
	
}

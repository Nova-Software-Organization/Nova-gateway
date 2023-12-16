package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import br.com.uol.pagseguro.api.common.domain.enums.PaymentMethodGroup;
import br.com.uol.pagseguro.api.common.domain.enums.PaymentMethodName;

public class MethodPaymentDTO implements Serializable {
	private PaymentMethodName nome;
	private PaymentMethodGroup grupo;
	private Boolean isConfig;
	private ConfigMethodPaymentDTO configMetodo;

	public PaymentMethodName getNome() {
		return nome;
	}

	public void setNome(PaymentMethodName nome) {
		this.nome = nome;
	}

	public PaymentMethodGroup getGrupo() {
		return grupo;
	}

	public void setGrupo(PaymentMethodGroup grupo) {
		this.grupo = grupo;
	}

	public Boolean getConfig() {
		return isConfig;
	}

	public void setConfig(Boolean config) {
		isConfig = config;
	}

	public ConfigMethodPaymentDTO getConfigMetodo() {
		return configMetodo;
	}

	public void setConfigMetodo(ConfigMethodPaymentDTO configMetodo) {
		this.configMetodo = configMetodo;
	}
}

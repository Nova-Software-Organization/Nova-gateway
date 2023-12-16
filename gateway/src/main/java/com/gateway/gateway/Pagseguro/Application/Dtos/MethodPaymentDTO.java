package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import br.com.uol.pagseguro.api.common.domain.enums.PaymentMethodGroup;
import br.com.uol.pagseguro.api.common.domain.enums.PaymentMethodName;
import lombok.Data;

@Data
public class MethodPaymentDTO implements Serializable {
	private PaymentMethodName name;
	private PaymentMethodGroup grup;
	private Boolean isConfig;
	private ConfigMethodPaymentDTO configMethod;
}

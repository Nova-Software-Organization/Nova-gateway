package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.uol.pagseguro.api.common.domain.enums.ConfigKey;
import lombok.Data;

@Data
public class ConfigMethodPaymentDTO implements Serializable {
	private static final long serialVersionUID = -3761767347198239951L;
	private ConfigKey key;
	private BigDecimal value;
}

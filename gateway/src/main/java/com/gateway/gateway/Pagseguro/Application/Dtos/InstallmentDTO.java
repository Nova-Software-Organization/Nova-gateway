package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class InstallmentDTO implements Serializable {
	private static final long serialVersionUID = 3179663878803239655L;
	private Integer quantity;
	private BigDecimal value;
}

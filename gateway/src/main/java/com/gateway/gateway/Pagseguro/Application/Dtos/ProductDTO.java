package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 5705849221618687589L;
	private Long id;
	private String description;
	private BigDecimal price;
	private Integer quantity;
	private Integer weight;
}

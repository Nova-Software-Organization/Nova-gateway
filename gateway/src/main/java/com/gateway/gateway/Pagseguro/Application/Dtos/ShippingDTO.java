package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.uol.pagseguro.api.common.domain.ShippingType;
import lombok.Data;

@Data
public class ShippingDTO implements Serializable {
	private static final long serialVersionUID = 7573962358475138663L;
	private ShippingType.Type type;
	private BigDecimal cost;
	private AddressDTO Address;
}

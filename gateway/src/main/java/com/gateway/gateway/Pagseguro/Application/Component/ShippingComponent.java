package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.ShippingDTO;

import br.com.uol.pagseguro.api.common.domain.builder.ShippingBuilder;

@Component
public class ShippingComponent {
	
	@Autowired
	private AddressComponent enderecoComponent;
	
	public ShippingBuilder toShippingBuilder(ShippingDTO shipping) {
		return new ShippingBuilder()
				.withType(shipping.getType())
				.withCost(shipping.getCost())
				.withAddress(
						enderecoComponent.toAddressBuilder(shipping.getAddress()));
	}
}
package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.AddressDTO;

import br.com.uol.pagseguro.api.common.domain.builder.AddressBuilder;

@Component
public class AddressComponent {
	
	public AddressBuilder toAddressBuilder(AddressDTO address) {
		return new AddressBuilder()
				.withPostalCode(address.getPostalCode())
				.withCountry(address.getCountry())
				.withState(address.getState())
				.withCity(address.getCity())
				.withComplement(address.getComplement())
				.withDistrict(address.getDistrict())
				.withNumber(address.getNumber())
				.withStreet(address.getRoad());
	}
}

package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import br.com.uol.pagseguro.api.common.domain.enums.State;
import lombok.Data;

@Data
public class AddressDTO implements Serializable {
	private static final long serialVersionUID = -3653697878417768782L;
	private String postalCode;
	private String country;
	private State state;
	private String city;
	private String complement;
	private String district;
	private String number;
	private String road;
}

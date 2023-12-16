package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import lombok.Data;

@Data
public class CardCreditDTO implements Serializable {
	private static final long serialVersionUID = -6666112398025610290L;
	private String token;
	private HolderDTO holder;
	private AddressDTO addressCharge;
	private InstallmentDTO installment;
}

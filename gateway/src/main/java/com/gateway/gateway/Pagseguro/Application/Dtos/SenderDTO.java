package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import lombok.Data;

@Data
public class SenderDTO implements Serializable {
	private static final long serialVersionUID = -6077524143056052745L;
	private Long id;
	private String name;
	private String cpf;
	private String email;
	private PhoneDTO phone;
}

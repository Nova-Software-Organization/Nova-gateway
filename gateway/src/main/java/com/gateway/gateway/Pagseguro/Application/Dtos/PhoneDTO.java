package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import lombok.Data;

@Data
public class PhoneDTO implements Serializable {
	private static final long serialVersionUID = -7738258343700536826L;
	private Long id;
	private String codeArea;
	private String number;
}

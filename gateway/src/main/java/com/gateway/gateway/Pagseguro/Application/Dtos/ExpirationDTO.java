package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import lombok.Data;

@Data
public class ExpirationDTO implements Serializable {
	private static final long serialVersionUID = -9204368499838009459L;
	private Integer value;
	private String unit;
}

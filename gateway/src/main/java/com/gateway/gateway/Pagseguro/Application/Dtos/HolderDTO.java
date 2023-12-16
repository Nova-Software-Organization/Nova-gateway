package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class HolderDTO implements Serializable {
	private static final long serialVersionUID = 4200380098214192698L;
	private String name;
	private Date dateBirthday;
	private PhoneDTO phone;
	private List<DocumentHolderDTO> document;
}

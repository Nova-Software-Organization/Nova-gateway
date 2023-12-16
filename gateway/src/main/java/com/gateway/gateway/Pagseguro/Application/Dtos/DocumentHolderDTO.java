package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;

import br.com.uol.pagseguro.api.common.domain.enums.DocumentType;
import lombok.Data;

@Data
public class DocumentHolderDTO implements Serializable {
	private static final long serialVersionUID = 403327550741362612L;
	private DocumentType type;
	private String value;
}

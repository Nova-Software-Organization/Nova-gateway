package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.DocumentHolderDTO;

import br.com.uol.pagseguro.api.common.domain.builder.DocumentBuilder;

@Component
public class DocumentHolderComponent {

	public DocumentBuilder toDocumentBuilder(DocumentHolderDTO documento) {
		return new DocumentBuilder()
				.withType(documento.getTipo())
				.withValue(documento.getValor());
	}
}

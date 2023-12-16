package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.SenderDTO;

import br.com.uol.pagseguro.api.common.domain.builder.SenderBuilder;

@Component
public class SenderComponent {

	@Autowired
	private PhoneComponent telefoneComponent;
	
	public SenderBuilder toSenderBuilder(SenderDTO remetente) {
		return new  SenderBuilder()
				.withEmail(remetente.getEmail())
				.withName(remetente.getNome())
				.withCPF(remetente.getCpf())
				.withHash("abc123")
				.withPhone(
						telefoneComponent.toPhoneBuilder(remetente.getTelefone()));
	}
}

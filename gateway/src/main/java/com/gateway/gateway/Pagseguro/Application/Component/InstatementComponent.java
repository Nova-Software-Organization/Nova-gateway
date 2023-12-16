package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.InstallmentDTO;

import br.com.uol.pagseguro.api.common.domain.builder.InstallmentBuilder;

@Component
public class InstatementComponent {

	public InstallmentBuilder toInstallmentBuilder(InstallmentDTO prestacao) {
		return new InstallmentBuilder()
				.withQuantity(prestacao.getQuantidade())
				.withValue(prestacao.getValor());
	}
}

package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.InstallmentDTO;

import br.com.uol.pagseguro.api.common.domain.builder.InstallmentBuilder;

@Component
public class InstatementComponent {

	public InstallmentBuilder toInstallmentBuilder(InstallmentDTO installment) {
		return new InstallmentBuilder()
				.withQuantity(installment.getQuantity())
				.withValue(installment.getValue());
	}
}

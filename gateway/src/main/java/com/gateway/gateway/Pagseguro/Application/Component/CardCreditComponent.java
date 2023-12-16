package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.CardCreditDTO;

import br.com.uol.pagseguro.api.common.domain.builder.CreditCardBuilder;

@Component
public class CardCreditComponent {
	private AddressComponent enderecoComponent;
	private HolderComponent titularComponent;
	private InstatementComponent prestacaoComponent;

    @Autowired
    public CardCreditComponent(AddressComponent enderecoComponent, HolderComponent titularComponent, InstatementComponent prestacaoComponent) {
        this.enderecoComponent = enderecoComponent;
        this.titularComponent = titularComponent;
        this.prestacaoComponent = prestacaoComponent;
    }

	public CreditCardBuilder toCreditCardBuilder(CardCreditDTO cartaoCredito) {
		return new CshBillingAddress(
						enderecoComponent.toAddressBuilder(cartaoCredito.getEnderecoCobranca()))
				.withInstallment(
						prestacaoComponent.toInstallmentBuilder(cartaoCredito.getPrestacao()))
				.withHolder(
						titularComponent.toHolderBuilder(cartaoCredito.getTitular()))
				.withToken("token");
	}
}

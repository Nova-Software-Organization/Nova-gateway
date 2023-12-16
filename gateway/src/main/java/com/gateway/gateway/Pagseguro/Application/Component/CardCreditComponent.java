package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.CardCreditDTO;

import br.com.uol.pagseguro.api.common.domain.builder.CreditCardBuilder;

@Component
public class CardCreditComponent {
	private AddressComponent addressComponent;
	private HolderComponent holderComponent;
	private InstatementComponent instatementComponent;

	@Autowired
	public CardCreditComponent(AddressComponent addressComponent, HolderComponent holderComponent, InstatementComponent instatementComponent) {
		this.addressComponent = addressComponent;
		this.holderComponent = holderComponent;
		this.instatementComponent = instatementComponent;
	}

	public CreditCardBuilder toCreditCardBuilder(CardCreditDTO cardCredit) {
        CreditCardBuilder creditCardBuilder = new CreditCardBuilder()
                .withBillingAddress(addressComponent.toAddressBuilder(cardCredit.getAddressCharge()))
                .withInstallment(instatementComponent.toInstallmentBuilder(cardCredit.getInstallment()))
                .withHolder(holderComponent.toHolderBuilder(cardCredit.getHolder()))
                .withToken("token");

        return creditCardBuilder;
    }
}

package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.ProductDTO;

import br.com.uol.pagseguro.api.common.domain.builder.PaymentItemBuilder;

@Component
public class ProductComponent {	
	public static PaymentItemBuilder toPaymentItemBuilder(ProductDTO produto) {
		return new PaymentItemBuilder()
				.withId(produto.getId().toString())
				.withDescription(produto.getDescricao())
				.withAmount(produto.getPreco())
				.withQuantity(produto.getQuantidade())
				.withWeight(produto.getPeso());
	}
}

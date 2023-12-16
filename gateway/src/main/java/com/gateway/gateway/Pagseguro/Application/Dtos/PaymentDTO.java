package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import br.com.uol.pagseguro.api.common.domain.enums.Currency;
import lombok.Data;

@Data
public class PaymentDTO implements Serializable{
	private static final long serialVersionUID = -1396721669039004741L;
	private Long id;
	private Currency coin;
	private BigDecimal extraPrice;
	private String reference;
	private ShippingDTO shipping;
	private SenderDTO sender;
	private List<ProductDTO> products;
	private CardCreditDTO cardCredit;
}

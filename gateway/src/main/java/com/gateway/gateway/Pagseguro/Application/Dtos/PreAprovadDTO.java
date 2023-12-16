package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import br.com.uol.pagseguro.api.common.domain.enums.Currency;
import lombok.Data;

@Data
public class PreAprovadDTO implements Serializable {
	private static final long serialVersionUID = 4682399098505830831L;
	private String redirectUrl;
	private String notificationRL;
	private Currency coin;
	private BigDecimal extraPrice;
	private String reference;
	private ShippingDTO shipping;
	private SenderDTO sender;
	private RequestPreAprovadDTO requestPreAprovad;
	private Map<String, String> parameters = new HashMap<String, String>();
}

package com.gateway.gateway.Pagseguro.Application.Component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.PaymentDTO;
import com.gateway.gateway.Pagseguro.Application.Dtos.ProductDTO;
import com.gateway.gateway.Pagseguro.Util.ConstantUtil;

import br.com.uol.pagseguro.api.transaction.register.DirectPaymentRegistrationBuilder;

@Component
public class PaymentComponent {
	private SenderComponent senderComponent;
	private ShippingComponent shippingComponent;
	private ProductComponent productComponent;

	@Autowired
	public PaymentComponent(SenderComponent senderComponent, ShippingComponent shippingComponent, ProductComponent productComponent) {
		this.senderComponent = senderComponent;
		this.shippingComponent = shippingComponent;
		this.productComponent = productComponent;
	}
    
	public DirectPaymentRegistrationBuilder toDirectPaymentRegistrationBuilder(PaymentDTO pagamento) {
			
		DirectPaymentRegistrationBuilder directPayment = new DirectPaymentRegistrationBuilder()
				.withPaymentMode("default")
				.withCurrency(pagamento.getCoin())
				.withExtraAmount(pagamento.getExtraPrice())
				.withNotificationURL(ConstantUtil.URL_NOTIFICATION)
				.withReference(ConstantUtil.REFERENCE_LIBJAVA)
				.withSender(
						senderComponent.toSenderBuilder(pagamento.getSender()))
				.withShipping(
						shippingComponent.toShippingBuilder(pagamento.getShipping()));
		          
		          
		List<ProductDTO> produtos = pagamento.getProducts();
  
		produtos.forEach(p -> {
			directPayment.addItem(
					productComponent.toPaymentItemBuilder(p));
		});
  
		return directPayment;
	}

}

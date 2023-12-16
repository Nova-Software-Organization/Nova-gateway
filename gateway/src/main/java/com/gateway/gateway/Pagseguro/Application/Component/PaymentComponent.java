package com.gateway.gateway.Pagseguro.Application.Component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.PaymentDTO;
import com.gateway.gateway.Pagseguro.Util.ConstantUtil;

import br.com.uol.pagseguro.api.transaction.register.DirectPaymentRegistrationBuilder;

@Component
public class PaymentComponent {
	private SenderComponent remetenteComponent;
	private ShippingComponent remessaComponent;
	private ProductComponent produtoComponent;
    
	@Autowired
    public PaymentComponent(SenderComponent remetenteComponent, ShippingComponent remessaComponent, ProductComponent produtoComponent) {
        this.remetenteComponent = remetenteComponent;
        this.remessaComponent = remessaComponent;
        this.produtoComponent = produtoComponent;
    }
	
	public DirectPaymentRegistrationBuilder toDirectPaymentRegistrationBuilder(PaymentDTO pagamento) {
			
		DirectPaymentRegistrationBuilder directPayment = new DirectPaymentRegistrationBuilder()
				.withPaymentMode("default")
				.withCurrency(pagamento.getMoeda())
				.withExtraAmount(pagamento.getPrecoExtra())
				.withNotificationURL(ConstantUtil.URL_NOTIFICATION)
				.withReference(ConstantUtil.REFERENCE_LIBJAVA)
				.withSender(
						remetenteComponent.toSenderBuilder(pagamento.getRemetente()))
				.withShipping(
						remessaComponent.toShippingBuilder(pagamento.getRemessa()));
		          
		          
		List<ProdutoDTO> produtos = pagamento.getProdutos();
  
		produtos.forEach(p -> {
			directPayment.addItem(
					produtoComponent.toPaymentItemBuilder(p));
		});
  
		return directPayment;
	}

}

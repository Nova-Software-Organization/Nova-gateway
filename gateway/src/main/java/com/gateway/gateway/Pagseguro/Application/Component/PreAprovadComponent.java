package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.PreAprovadDTO;

import br.com.uol.pagseguro.api.preapproval.PreApprovalRegistrationBuilder;

@Component
public class PreAprovadComponent {
	private SenderComponent senderComponent;
	private ShippingComponent shippingComponent;
	private RequestPreAprovadComponent requestPreAprovadComponent;
    
	@Autowired
	public PreAprovadComponent(SenderComponent senderComponent, ShippingComponent shippingComponent, RequestPreAprovadComponent requestPreAprovadComponent) {
		this.senderComponent = senderComponent;
		this.shippingComponent = shippingComponent;
		this.requestPreAprovadComponent = requestPreAprovadComponent;
	}
		
	 public PreApprovalRegistrationBuilder toPreApprovalRegistrationBuilder(PreAprovadDTO preAprovad) {
		 return new PreApprovalRegistrationBuilder()
	              .withCurrency(preAprovad.getCoin())
	              .withExtraAmount(preAprovad.getExtraPrice())
	              .withReference(preAprovad.getReference())
	              .withSender(
	            		  senderComponent.toSenderBuilder(preAprovad.getSender()))
	              .withShipping(
	            		  shippingComponent.toShippingBuilder(preAprovad.getShipping()))
	              .withPreApproval(
	            		  requestPreAprovadComponent.toPreApprovalRequestBuilder(preAprovad.getRequestPreAprovad()))
	              .withRedirectURL(preAprovad.getRedirectUrl())
	              .withNotificationURL(preAprovad.getNotificationRL());
	 }
}

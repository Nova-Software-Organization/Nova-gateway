package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.PreAprovadDTO;

import br.com.uol.pagseguro.api.preapproval.PreApprovalRegistrationBuilder;

@Component
public class PreAprovadComponent {
	private SenderComponent remetenteComponent;
	private ShippingComponent remessaComponent;
	private RequestPreAprovadComponent requisicaoPreAprovadoComponent;
    
	@Autowired
    public PreAprovadComponent(SenderComponent remetenteComponent, ShippingComponent remessaComponent, RequestPreAprovadComponent requisicaoPreAprovadoComponent) {
        this.remetenteComponent = remetenteComponent;
        this.remessaComponent = remessaComponent;
        this.requisicaoPreAprovadoComponent = requisicaoPreAprovadoComponent;
    }
	
	 public PreApprovalRegistrationBuilder toPreApprovalRegistrationBuilder(PreAprovadDTO preAprovado) {
		 return new PreApprovalRegistrationBuilder()
	              .withCurrency(preAprovado.getMoeda())
	              .withExtraAmount(preAprovado.getPrecoExtra())
	              .withReference(preAprovado.getReferencia())
	              .withSender(
	            		  remetenteComponent.toSenderBuilder(preAprovado.getRemetente()))
	              .withShipping(
	            		  remessaComponent.toShippingBuilder(preAprovado.getRemessa()))
	              .withPreApproval(
	            		  requisicaoPreAprovadoComponent.toPreApprovalRequestBuilder(preAprovado.getRequisicao()))
	              .withRedirectURL(preAprovado.getRedirecionaURL())
	              .withNotificationURL(preAprovado.getNotificacaoRL());
	 }
}

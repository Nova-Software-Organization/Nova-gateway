package com.gateway.gateway.Pagseguro.Domain.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gateway.gateway.Pagseguro.Application.Component.CardCreditComponent;
import com.gateway.gateway.Pagseguro.Application.Component.PaymentComponent;
import com.gateway.gateway.Pagseguro.Application.Dtos.PaymentDTO;

import br.com.uol.pagseguro.api.PagSeguro;
import br.com.uol.pagseguro.api.transaction.register.DirectPaymentRegistrationBuilder;
import br.com.uol.pagseguro.api.transaction.search.TransactionDetail;

@Service
public class CheckoutTransparentService {
    private PaymentComponent paymentComponent;
    private PagSeguro pagSeguro;
    private CardCreditComponent cardCreditComponent;

    @Autowired
    public CheckoutTransparentService(PaymentComponent paymentComponent, PagSeguro pagSeguro, CardCreditComponent cardCreditComponent) {
        this.paymentComponent = paymentComponent;
        this.pagSeguro = pagSeguro;
        this.cardCreditComponent = cardCreditComponent;
    }

    public ResponseEntity<TransactionDetail> createTransaction(PaymentDTO payment) {
         DirectPaymentRegistrationBuilder directPayment = paymentComponent.toDirectPaymentRegistrationBuilder(payment);
            // Checkout transparente (pagamento direto) com cartao de credito
            TransactionDetail creditCardTransaction = pagSeguro.transactions()
                    .register(directPayment)
                    .withCreditCard(
                            cardCreditComponent.toCreditCardBuilder(payment.getCardCredit()));
            return ResponseEntity.status(HttpStatus.CREATED).body(creditCardTransaction);
    }
}

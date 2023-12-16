package com.gateway.gateway.Pagseguro.Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gateway.gateway.Pagseguro.Application.Dtos.PaymentDTO;
import com.gateway.gateway.Pagseguro.Domain.Service.CheckoutTransparentService;

import br.com.uol.pagseguro.api.transaction.search.TransactionDetail;

@RestController
@RequestMapping("/gateway/pagseguro")
public class TransactionController {

    private CheckoutTransparentService pagseguroService;

    @Autowired
    public TransactionController(
        CheckoutTransparentService pagseguroService
    ) {
        this.pagseguroService = pagseguroService;
    }

    @PostMapping(value = "/create/card-credit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TransactionDetail> createTransaction(@RequestBody PaymentDTO paymentDTO) {
        ResponseEntity<TransactionDetail> newPayment = pagseguroService.createTransaction(paymentDTO);
        return newPayment;
    }
}

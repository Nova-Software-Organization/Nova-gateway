package com.gateway.gateway.Pagseguro.Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gateway.gateway.Pagseguro.Application.Dtos.PagseguroDTO;
import com.gateway.gateway.Pagseguro.Domain.service.PagseguroService;

@RestController
@RequestMapping("/gateway/pagseguro")
public class PagseguroController {

    private PagseguroService pagseguroService;

    @Autowired
    public PagseguroController(
        PagseguroService pagseguroService
    ) {
        this.pagseguroService = pagseguroService;
    }

    public ResponseEntity<String> createPayment(@RequestBody PagseguroDTO pagseguroDTO) {
        // PagseguroService newPayment = pagseguroService.createTransaction(pagseguroDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Pagamento pendente");
    }
}

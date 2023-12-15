package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class PagseguroDTO {
    private String cardNumber;
    private String cpf;
    private Date purchase_date;
    private String status;
    private BigDecimal value;
    private String installments;
}

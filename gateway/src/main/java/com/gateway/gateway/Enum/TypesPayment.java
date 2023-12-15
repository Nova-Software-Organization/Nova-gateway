package com.gateway.gateway.Enum;

public enum TypesPayment {
    TICKET("Boleto"),
    CREDIT("Credito"),
    PIX("pix");

    private final String  typePayment;

    private TypesPayment(String typePayment) {
        this.typePayment = typePayment;
    }

    public String TypesPaymentString() {
        return typePayment;
    }
}

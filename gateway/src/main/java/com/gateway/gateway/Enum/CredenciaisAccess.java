package com.gateway.gateway.Enum;

public enum CredenciaisAccess {
    CREDENCIAIS("EMAIL", "TOKEN");

    private final String email;
    private final String token;

    private CredenciaisAccess(String email, String token) {
        this.email = email;
        this.token = token;
    }

    public String getEmailString() {
        return email;
    }

    public String getTokenString() {
        return token;
    }
}

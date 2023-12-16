package com.gateway.gateway.Pagseguro.Infra.Config;

import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties.Decryption.Credential;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.gateway.gateway.Enum.CredenciaisAccess;

import br.com.uol.pagseguro.api.PagSeguro;
import br.com.uol.pagseguro.api.PagSeguroEnv;
import br.com.uol.pagseguro.api.http.JSEHttpClient;
import br.com.uol.pagseguro.api.utils.logging.SimpleLoggerFactory;

@EnableWebMvc
@Configuration
public class PagseguroCoreConfiguration {
    
    private String email = CredenciaisAccess.CREDENCIAIS.getEmailString();
    private String token = CredenciaisAccess.CREDENCIAIS.getTokenString();
    
    @Bean
	public PagSeguro getPagSeguro() {
		return PagSeguro
                .instance(new SimpleLoggerFactory(), new JSEHttpClient(),
                    Credential.sellerCredential(email, token), PagSeguroEnv.SANDBOX);
	}
}

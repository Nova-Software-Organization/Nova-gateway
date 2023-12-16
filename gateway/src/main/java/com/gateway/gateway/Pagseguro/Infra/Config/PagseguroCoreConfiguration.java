package com.gateway.gateway.Pagseguro.Infra.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.uol.pagseguro.api.PagSeguro;
import br.com.uol.pagseguro.api.PagSeguroEnv;
import br.com.uol.pagseguro.api.credential.Credential;
import br.com.uol.pagseguro.api.http.JSEHttpClient;
import br.com.uol.pagseguro.api.utils.logging.SimpleLoggerFactory;

@EnableWebMvc
@Configuration
public class PagseguroCoreConfiguration {
    
    private final static String email = "aa";
    private final static String token = "aa";
    
    @Bean
	public PagSeguro getPagSeguro() {
		return PagSeguro
                .instance(new SimpleLoggerFactory(), new JSEHttpClient(),
                    Credential.sellerCredential(email, token), PagSeguroEnv.SANDBOX);
	}
}

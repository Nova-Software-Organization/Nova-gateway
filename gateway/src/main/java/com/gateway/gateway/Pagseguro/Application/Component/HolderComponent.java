package com.gateway.gateway.Pagseguro.Application.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.DocumentHolderDTO;
import com.gateway.gateway.Pagseguro.Application.Dtos.HolderDTO;

import br.com.uol.pagseguro.api.common.domain.builder.HolderBuilder;

@Component
public class HolderComponent {
	
	@Autowired
	private PhoneComponent telefoneComponent;
	
	@Autowired
	private DocumentHolderComponent documentoTitularComponent;

	public HolderBuilder toHolderBuilder(HolderDTO titular) {
		 
		HolderBuilder holder;
		holder = new HolderBuilder()
				.withName(titular.getNome())
				.withPhone(
						telefoneComponent.toPhoneBuilder(titular.getTelefone()));
		try {
			holder.withBithDate(new SimpleDateFormat("dd/MM/yyyy").parse(titular.getDataAniversario().toString()));
		} catch (ParseException e) {

			e.printStackTrace();
		}
         
		List<DocumentHolderDTO> documentos = titular.getDocumentos();
		documentos.forEach(d -> {
			holder.addDocument(
					documentoTitularComponent.toDocumentBuilder(d));
		});
         
		return holder;
	}
}

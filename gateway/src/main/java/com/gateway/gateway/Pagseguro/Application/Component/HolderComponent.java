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
	private PhoneComponent telefoneComponent;	
	private DocumentHolderComponent documentoTitularComponent;
	
	@Autowired
	public HolderComponent(PhoneComponent telefoneComponent, DocumentHolderComponent documentoTitularComponent) {
		this.telefoneComponent = telefoneComponent;
		this.documentoTitularComponent = documentoTitularComponent;
	}

	public HolderBuilder toHolderBuilder(HolderDTO holderDTO) {
		 
		HolderBuilder holder;
		holder = new HolderBuilder()
				.withName(holderDTO.getName())
				.withPhone(
						telefoneComponent.toPhoneBuilder(holderDTO.getPhone()));
		try {
			holder.withBithDate(new SimpleDateFormat("dd/MM/yyyy").parse(holderDTO.getDateBirthday().toString()));
		} catch (ParseException e) {

			e.printStackTrace();
		}
         
		List<DocumentHolderDTO> documents = holderDTO.getDocument();
		documents.forEach(d -> {
			holder.addDocument(
					documentoTitularComponent.toDocumentBuilder(d));
		});
         
		return holder;
	}
}

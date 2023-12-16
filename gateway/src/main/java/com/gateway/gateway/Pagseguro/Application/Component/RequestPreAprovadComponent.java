package com.gateway.gateway.Pagseguro.Application.Component;

import org.springframework.stereotype.Component;

import com.gateway.gateway.Pagseguro.Application.Dtos.RequestPreAprovadDTO;

import br.com.uol.pagseguro.api.common.domain.builder.DateRangeBuilder;
import br.com.uol.pagseguro.api.common.domain.builder.PreApprovalRequestBuilder;

@Component
public class RequestPreAprovadComponent {

	public PreApprovalRequestBuilder toPreApprovalRequestBuilder(RequestPreAprovadDTO request) {
        return new PreApprovalRequestBuilder()
                .withCharge(request.getLoad())
                .withName(request.getName())
                .withDetails(request.getDetails())
                .withAmountPerPayment(request.getMaxTotalValue())
                .withMaxTotalAmount(request.getMaxTotalValue())
                .withMaxAmountPerPeriod(request.getMaxPercentagePeriodValue())
                .withMaxAmountPerPeriod(request.getMaxPaymentPercentageValue())
                .withPeriod(request.getPeriod())
                .withDateRange(new DateRangeBuilder()
                        .between(
                                request.getStartDate(),
                                request.getEndDate()));
    }
}

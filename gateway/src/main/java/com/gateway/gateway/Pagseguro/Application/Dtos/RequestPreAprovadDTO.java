package com.gateway.gateway.Pagseguro.Application.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class RequestPreAprovadDTO implements Serializable {
	private static final long serialVersionUID = 933728537599505165L;
    private String load;
    private String name;
    private String details;
    private BigDecimal additionalPaymentPercentage;
    private BigDecimal maxPaymentPercentageValue;
    private BigDecimal maxTotalValue;
    private BigDecimal maxPercentagePeriodValue;
    private Integer maxPercentagePeriodPayment;
    private String period;
    private Date startDate;
    private Date endDate;
    private BigDecimal associationFee;
    private Integer periodAttemptDuration;
    private ExpirationDTO expiration;
    private String dayOfYear;
    private Integer dayOfMonth;
    private String dayOfWeek;
    private String cancelURL;
}

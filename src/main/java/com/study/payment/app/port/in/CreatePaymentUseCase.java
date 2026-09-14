package com.study.payment.app.port.in;

import com.study.payment.domain.Payment;

import java.math.BigDecimal;
import java.util.Currency;


public interface CreatePaymentUseCase {

    Payment create(BigDecimal amount, Currency currency);
}

package com.study.payment.app.service;

import com.study.payment.app.port.in.CreatePaymentUseCase;
import com.study.payment.domain.Payment;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public class CreatePaymentService implements CreatePaymentUseCase {

    @Override
    public Payment create(BigDecimal amount, Currency currency) {
        return new Payment(UUID.randomUUID(), amount, currency);
    }
}

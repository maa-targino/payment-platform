package com.study.payment.app.service;

import com.study.payment.app.port.in.CreatePaymentUseCase;
import com.study.payment.app.port.out.PaymentRepository;
import com.study.payment.domain.Payment;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public class CreatePaymentService implements CreatePaymentUseCase {

    private final PaymentRepository paymentRepository;

    public CreatePaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment create(BigDecimal amount, Currency currency) {
        Payment payment = new Payment(UUID.randomUUID(), amount, currency);
        paymentRepository.save(payment);
        return payment;
    }
}

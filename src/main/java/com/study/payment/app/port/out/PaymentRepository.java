package com.study.payment.app.port.out;

import com.study.payment.domain.Payment;

public interface PaymentRepository {
    Payment save(Payment payment);
}

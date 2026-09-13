package com.study.payment.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PaymentTest {

    @Test
    void shouldNotAcceptNullId() {
        assertThrows(IllegalArgumentException.class, () -> new Payment(null, BigDecimal.valueOf(100.00), Currency.getInstance("EUR")));
    }

    @Test
    void shouldCreatePaymentWithPendingStatus() {
        Payment payment = new Payment(UUID.randomUUID(), BigDecimal.valueOf(100.00), Currency.getInstance("EUR"));

        assertEquals(PaymentStatus.PENDING, payment.getStatus());
    }

    @Test
    void shouldNotAcceptNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> new Payment(UUID.randomUUID(), BigDecimal.valueOf(-100.00), Currency.getInstance("EUR")));
    }

    @Test
    void shouldNotAcceptZeroAmount() {
        assertThrows(IllegalArgumentException.class, () -> new Payment(UUID.randomUUID(), BigDecimal.ZERO, Currency.getInstance("EUR")));
    }

    @Test
    void shouldNotAcceptNullAmount() {
        assertThrows(IllegalArgumentException.class, () -> new Payment(UUID.randomUUID(), null, Currency.getInstance("EUR")));
    }

    @Test
    void shouldNotAcceptNullCurrency() {
        assertThrows(IllegalArgumentException.class, () -> new Payment(UUID.randomUUID(), BigDecimal.valueOf(100.00), null));
    }
}

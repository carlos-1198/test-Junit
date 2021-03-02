package com.javaTest.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}

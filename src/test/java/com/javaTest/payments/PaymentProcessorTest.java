package com.javaTest.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    //Before its execute before every single method, if you have 3 methods,
    //before will execute 3 times
    @Before
    public void setup(){
        //usually when you have repeated code, you use a setup class to write it only one time
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void paymentSuccess(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void paymentError(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}

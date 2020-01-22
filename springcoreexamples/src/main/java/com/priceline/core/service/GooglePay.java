package com.priceline.core.service;

import org.springframework.stereotype.Service;

@Service(value = "googlePay")
public class GooglePay implements PaymentGateway {
    @Override
    public void acceptPayment(String from, String to, double amount, String notes) {
        System.out.println("Payment transaction done using Google Pay!!");
    }
}
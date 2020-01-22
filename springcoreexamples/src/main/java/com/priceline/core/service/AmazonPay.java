package com.priceline.core.service;

public class AmazonPay implements PaymentGateway {

    public void acceptPayment(String from, String to, double amount, String notes) {
        System.out.println(" transaction using Amazon Pay !!");
    }
}
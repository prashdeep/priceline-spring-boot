package com.priceline.core.service;

public interface PaymentGateway {

    void acceptPayment(String from, String to, double amount, String notes);
}
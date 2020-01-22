package com.priceline.core;

import com.priceline.core.service.PaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "merchant")
public class Merchant {
    private PaymentGateway paymentGateway;
    private String merchantName;

    public Merchant( PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
        this.merchantName = "Reliance Digitatl";
    }

    public void performTransaction(String from, double amount, String notes){
        this.paymentGateway.acceptPayment(from, this.merchantName, amount, notes);
    }
}
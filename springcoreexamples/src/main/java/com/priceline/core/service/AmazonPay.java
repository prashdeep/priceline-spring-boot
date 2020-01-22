package com.priceline.core.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Primary
public class AmazonPay implements PaymentGateway {

    public void acceptPayment(String from, String to, double amount, String notes) {
        System.out.println(" transaction using Amazon Pay !!");
    }

    @PostConstruct
    public void customInitialization(){
        System.out.println("Custom initializatin logic");
    }

    @PreDestroy
    public void customDestruction(){
        System.out.println("Custom destruction logic");
    }
}
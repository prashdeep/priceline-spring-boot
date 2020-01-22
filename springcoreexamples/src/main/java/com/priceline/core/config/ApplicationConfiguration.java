package com.priceline.core.config;

import com.priceline.core.Merchant;
import com.priceline.core.service.AmazonPay;
import com.priceline.core.service.PaymentGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {

    @Bean(value = "paymentGateway")
    @Scope("singelon")
    public PaymentGateway paymentGateway(){
        return new AmazonPay();
    }

    @Bean
    public Merchant merchant(){
        return new Merchant(paymentGateway());
    }
}
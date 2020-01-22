package com.priceline.core.client;

import com.priceline.core.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-configuration.xml");
        Merchant merchant = applicationContext.getBean("merchant", Merchant.class);
        merchant.performTransaction("Vikas", 20_000, "Purchasing IPad Mini");
    }
}
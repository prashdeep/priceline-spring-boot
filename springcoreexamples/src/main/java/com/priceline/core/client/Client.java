package com.priceline.core.client;

import com.priceline.core.Merchant;
import com.priceline.core.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
                //new ClassPathXmlApplicationContext("application-configuration.xml");
        Merchant merchant = applicationContext.getBean("merchant", Merchant.class);
        merchant.performTransaction("Vikas", 20_000, "Purchasing IPad Mini");

        ((AbstractApplicationContext)applicationContext).registerShutdownHook();
    }
}
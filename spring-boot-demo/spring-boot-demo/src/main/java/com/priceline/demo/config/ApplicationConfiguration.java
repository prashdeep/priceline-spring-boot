package com.priceline.demo.config;

import com.priceline.demo.dao.Test;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@ConditionalOnProperty(name="flag",value = "true", matchIfMissing = false)
//@Configuration
public class ApplicationConfiguration {

    @Bean
    public Test test(){
        return new Test();
    }
}
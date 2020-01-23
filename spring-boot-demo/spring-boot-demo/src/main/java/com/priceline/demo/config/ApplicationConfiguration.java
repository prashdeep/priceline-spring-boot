package com.priceline.demo.config;

import com.priceline.demo.dao.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@ConfigurationProperties(prefix = "app")
@Validated
//@ConditionalOnProperty(name="flag",value = "true", matchIfMissing = false)
@Configuration
public class ApplicationConfiguration {

    //private Dev dev = new Dev();
    @NotBlank(message = "username cannot be blank")
        private String username;

        @NotBlank(message = "password cannot be blank")
        private String password;
//
//    private static class Dev {
//        @NotBlank(message = "username cannot be blank")
//        private String username;
//
//        @NotBlank(message = "password cannot be blank")
//        private String password;
//    }


   // @NotNull
    private List<String> locations;

    @Bean
    public Test test(){
        return new Test();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }
}
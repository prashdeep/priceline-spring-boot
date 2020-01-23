package com.priceline.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptPassordEncoderUtil {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String encode = passwordEncoder.encode("kiran");
        String encode1 = passwordEncoder.encode("kiran");

        System.out.println("Encoded 1 "+encode);
        System.out.println("Encoded 2 "+encode1);

        System.out.println(passwordEncoder.matches("kiran", encode));
    }
}
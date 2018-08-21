package com.github.nilankamanoj.dependency.injection.service;

public class YahooEmailService implements EmailService {

    @Override
    public void sendEmail(String email) {
        System.out.println("yahoo sending email");
    }
}

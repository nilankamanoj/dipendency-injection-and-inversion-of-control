package com.github.nilankamanoj.dependency.injection.service;



public class GoogleEmailService implements EmailService {

    @Override
    public void sendEmail(String email) {
        System.out.println("google sending email");
    }
}
package com.github.nilankamanoj.dependency.injection.basic;

public class GoogleMail implements Mail {
    public void sendEmail(){
        System.out.println("google sending email");
    }
}

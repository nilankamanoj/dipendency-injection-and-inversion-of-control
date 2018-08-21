package com.github.nilankamanoj.dependency.injection.basic;

public class EmailSenderNoInjectionTight {
    private GoogleMail googleMail;

    public EmailSenderNoInjectionTight(){
        this.googleMail = new GoogleMail();
    }
}

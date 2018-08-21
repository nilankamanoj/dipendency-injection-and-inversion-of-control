package com.github.nilankamanoj.dependency.injection.basic;

public class EmailSenderNoInjectionLose {
    private Mail mail;

    public EmailSenderNoInjectionLose(){
        this.mail = new GoogleMail();
    }
}

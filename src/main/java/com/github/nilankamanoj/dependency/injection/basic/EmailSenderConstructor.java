package com.github.nilankamanoj.dependency.injection.basic;

public class EmailSenderConstructor {
    private Mail mail;

    public EmailSenderConstructor(Mail mail){
        this.mail = mail;
    }
}


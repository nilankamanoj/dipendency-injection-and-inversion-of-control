package com.github.nilankamanoj.dependency.injection.basic;

import org.hibernate.validator.constraints.Email;

public class EmailSenderSetter {
    private Email email;

    public void setEmail(Email email) {
        this.email = email;
    }
}

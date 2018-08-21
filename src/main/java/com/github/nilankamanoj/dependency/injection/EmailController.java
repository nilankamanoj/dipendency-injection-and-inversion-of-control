package com.github.nilankamanoj.dependency.injection;

import com.github.nilankamanoj.dependency.injection.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    EmailService emailService;

    @RequestMapping("/")
    public String sendEmail() {
        emailService.sendEmail("test");
        return "done";
    }
}
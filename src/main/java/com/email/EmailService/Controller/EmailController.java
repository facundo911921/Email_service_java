package com.email.EmailService.Controller;

import com.email.EmailService.Model.EmailRequest;
import com.email.EmailService.Service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/send")
    public void sendEmail (@Valid @RequestBody EmailRequest emailRequest) {
        emailService.sendEmail(emailRequest);
    }
}

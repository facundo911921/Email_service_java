package com.email.EmailService.Service;

import com.email.EmailService.Model.EmailRequest;
import com.email.EmailService.Repository.EmailRepository;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail (EmailRequest emailRequest) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        try {
            mailMessage.setTo(emailRequest.getRecipient());
            mailMessage.setSubject(emailRequest.getSubject());
            mailMessage.setText(emailRequest.getBody());
            mailSender.send(mailMessage);

            emailRequest.setSentAt(LocalDateTime.now());
            emailRequest.setStatus("SENT");

        } catch (Exception e) {
            emailRequest.setSentAt(LocalDateTime.now());
            emailRequest.setStatus("FAILED");

            throw new RuntimeException("Error to send e-mail: " + e.getMessage());
        } finally {
            emailRepository.save(emailRequest);
        }

    }
}

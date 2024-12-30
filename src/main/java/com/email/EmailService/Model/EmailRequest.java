package com.email.EmailService.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "emails")
public class EmailRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The field 'To' is required")
    @Email(message = "The email adress must to be valid")
    private String recipient;

    @NotBlank(message = "The field 'Subject' is required")
    private String subject;

    @NotBlank(message = "The field 'Body' is required")
    private String body;

    private LocalDateTime sentAt;

    private String status;
}

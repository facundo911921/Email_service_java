package com.email.EmailService.Repository;

import com.email.EmailService.Model.EmailRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<EmailRequest, Long> {
}

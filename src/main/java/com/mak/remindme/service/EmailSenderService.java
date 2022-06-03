package com.mak.remindme.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailSenderService {

    private final JavaMailSender javaMailSender;

    public EmailSenderService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendSimpleMail(Email email)
    {
        try {
            javaMailSender.send(email.getMailMessage());
        }
        catch (MailException e) {
            log.error("Email sending failed {}", e.getMessage(), e);
        }
    }

}

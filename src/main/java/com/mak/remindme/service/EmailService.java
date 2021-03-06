package com.mak.remindme.service;

import com.mak.remindme.dto.EmailDetailsDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements Email {

    private final String sender;

    private SimpleMailMessage mailMessage;

    public EmailService(@Value("${spring.mail.username}") String sender) {
        this.sender = sender;
    }

    @Override
    public SimpleMailMessage getMailMessage() {
        return this.mailMessage;
    }

    @Override
    public void setMailMessage(EmailDetailsDto emailDetails) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(sender);
        mailMessage.setTo(emailDetails.getRecipient());
        mailMessage.setText(emailDetails.getEmailBody());
        mailMessage.setSubject(emailDetails.getSubject());
        this.mailMessage = mailMessage;
    }

}

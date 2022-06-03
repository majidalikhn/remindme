package com.mak.remindme.controller;

import com.mak.remindme.dto.EmailDetailsDto;
import com.mak.remindme.service.EmailSenderService;
import com.mak.remindme.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final EmailService emailService;
    private final EmailSenderService emailSenderService;

    public EmailController(EmailService emailService, EmailSenderService emailSenderService) {
        this.emailService = emailService;
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/")
    public void emailSend(@RequestBody EmailDetailsDto emailDetails) {
        emailService.setMailMessage(emailDetails);
        emailSenderService.sendSimpleMail(emailService);
    }

}

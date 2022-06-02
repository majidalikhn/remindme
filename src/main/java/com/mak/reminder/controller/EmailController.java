package com.mak.reminder.controller;

import com.mak.reminder.dto.EmailDetails;
import com.mak.reminder.service.DOBEmailService;
import com.mak.reminder.service.EmailSendingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final DOBEmailService dobEmailService;
    private final EmailSendingService emailSendingService;

    public EmailController(DOBEmailService dobEmailService, EmailSendingService emailSendingService) {
        this.dobEmailService = dobEmailService;
        this.emailSendingService = emailSendingService;
    }

    @PostMapping("/sendDOBMail")
    public String sendDOBMail(@RequestBody EmailDetails details)
    {
        dobEmailService.setMailMessage(details);
        return emailSendingService.sendSimpleMail(dobEmailService);
    }

}

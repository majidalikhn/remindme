package com.mak.remindme.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailSchedulerService {

    private final EmailSendingService emailSendingService;
    private final EmailDetailsListService emailUsersService;
    private final DOBEmailService dobEmailService;

    public EmailSchedulerService(EmailSendingService emailSendingService, EmailDetailsListService emailUsersService, DOBEmailService dobEmailService) {
        this.emailSendingService = emailSendingService;
        this.emailUsersService = emailUsersService;
        this.dobEmailService = dobEmailService;
    }

    @Scheduled(fixedRate = 1000)
    public void scheduleEmail()
    {
        log.info("Sending email");
        emailUsersService.fetchEmailDetailsList().forEach(emailDetails -> {
                    dobEmailService.setMailMessage(emailDetails);
                    emailSendingService.sendSimpleMail(dobEmailService);
        });
        log.info("Successfully sent emails");
    }

}

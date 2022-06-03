package com.mak.remindme.service;

import com.mak.remindme.repository.EmailDetailsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailSchedulerService {

    private final EmailSenderService emailSendingService;
    private final EmailDetailsServiceImpl emailDetailsListService;
    private final DOBEmailService dobEmailService;

    public EmailSchedulerService(EmailSenderService emailSendingService, EmailDetailsServiceImpl emailDetailsListService, DOBEmailService dobEmailService) {
        this.emailSendingService = emailSendingService;
        this.emailDetailsListService = emailDetailsListService;
        this.dobEmailService = dobEmailService;
    }

    @Scheduled(cron = "0 0 0 * * ?")
    public void scheduleEmail()
    {
        log.info("Sending email");
        if (!emailDetailsListService.fetchEmailDetails().isEmpty()) {
            emailDetailsListService.fetchEmailDetails().forEach(emailDetails -> {
                if (DateCalculaterService.isToday(emailDetails.getEmailSendingDate())) {
                    dobEmailService.setMailMessage(emailDetails);
                    emailSendingService.sendSimpleMail(dobEmailService);
                }
            });
        }
        log.info("Successfully sent emails");
    }

}

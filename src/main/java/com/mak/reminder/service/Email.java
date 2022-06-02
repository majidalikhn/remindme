package com.mak.reminder.service;

import com.mak.reminder.dto.EmailDetails;
import org.springframework.mail.SimpleMailMessage;

public interface Email {

    SimpleMailMessage getMailMessage();
    void setMailMessage(EmailDetails emailDetails);


}

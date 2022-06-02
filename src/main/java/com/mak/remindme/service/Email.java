package com.mak.remindme.service;

import com.mak.remindme.dto.EmailDetails;
import org.springframework.mail.SimpleMailMessage;

public interface Email {

    SimpleMailMessage getMailMessage();
    void setMailMessage(EmailDetails emailDetails);


}

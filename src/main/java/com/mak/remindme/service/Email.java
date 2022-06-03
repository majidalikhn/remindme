package com.mak.remindme.service;

import com.mak.remindme.dto.EmailDetailsDto;
import org.springframework.mail.SimpleMailMessage;

public interface Email {

    SimpleMailMessage getMailMessage();
    void setMailMessage(EmailDetailsDto emailDetails);

}

package com.mak.remindme.service;

import com.mak.remindme.dto.EmailDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailDetailsListService {

    public List<EmailDetails> fetchEmailDetailsList(){
        List<EmailDetails> emailDetailsList = new ArrayList<>();
        EmailDetails emailDetails1 = new EmailDetails();
        emailDetails1.setSubject("First email");
        emailDetails1.setRecipient("majidalikhn@gmail.com");
        emailDetails1.setMsgBody("This is Body of First email");
        emailDetailsList.add(emailDetails1);

        return emailDetailsList;
    }




}

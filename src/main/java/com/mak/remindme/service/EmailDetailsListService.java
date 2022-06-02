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

        EmailDetails emailDetails2 = new EmailDetails();
        emailDetails2.setSubject("Second email");
        emailDetails2.setRecipient("majidalikhn@gmail.com");
        emailDetails2.setMsgBody("This is Body of Second email");
        emailDetailsList.add(emailDetails2);

        EmailDetails emailDetails3 = new EmailDetails();
        emailDetails3.setSubject("Third email");
        emailDetails3.setRecipient("majidalikhn@gmail.com");
        emailDetails3.setMsgBody("This is Body of Third email");
        emailDetailsList.add(emailDetails3);

        return emailDetailsList;
    }




}

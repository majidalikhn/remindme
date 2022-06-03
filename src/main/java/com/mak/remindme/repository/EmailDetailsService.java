package com.mak.remindme.repository;

import com.mak.remindme.dto.EmailDetailsDto;

import java.util.List;

public interface EmailDetailsService {

    List<EmailDetailsDto> fetchEmailDetails();

    void saveEmailDetails(EmailDetailsDto emailDetails);

}

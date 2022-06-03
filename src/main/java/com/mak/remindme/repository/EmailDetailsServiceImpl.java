package com.mak.remindme.repository;

import com.mak.remindme.dto.EmailDetailsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailDetailsServiceImpl implements EmailDetailsService{

    private final EmailDetailsRepository emailDetailsRepository;

    public EmailDetailsServiceImpl(EmailDetailsRepository emailDetailsRepository) {
        this.emailDetailsRepository = emailDetailsRepository;
    }

    @Override
    public List<EmailDetailsDto> fetchEmailDetails() {
        return emailDetailsRepository.findAll();
    }

    @Override
    public void saveEmailDetails(EmailDetailsDto emailDetails) {
        emailDetailsRepository.save(emailDetails);
    }
}

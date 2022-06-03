package com.mak.remindme.repository;

import com.mak.remindme.dto.EmailDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailDetailsRepository extends JpaRepository<EmailDetailsDto, Long> {
}

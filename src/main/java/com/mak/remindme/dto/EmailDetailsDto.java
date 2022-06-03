package com.mak.remindme.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "email_details")
public class EmailDetailsDto {
    private String recipient;
    private String messageBody;
    private String subject;
    private String emailSendingDate;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
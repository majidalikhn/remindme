package com.mak.remindme.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailDetailsDto {

    private String recipient;
    private String emailBody;
    private String subject;

}
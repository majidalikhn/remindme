package com.mak.remindme.controller;

import com.mak.remindme.dto.EmailDetailsDto;
import com.mak.remindme.repository.EmailDetailsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    private final EmailDetailsServiceImpl emailDetailsListService;

    public EmailController(EmailDetailsServiceImpl emailDetailsListService) {
        this.emailDetailsListService = emailDetailsListService;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/remindme";
    }

    @GetMapping("/remindme")
    public String formGet() {
        return "remindme";
    }

    @PostMapping("/remindme")
    public String formPost(EmailDetailsDto emailDetails) {
        emailDetailsListService.saveEmailDetails(emailDetails);
        return "remindme";
    }

}

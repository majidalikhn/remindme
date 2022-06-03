package com.mak.remindme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
public class RemindMeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemindMeApplication.class, args);
    }

}

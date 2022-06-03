package com.mak.remindme.service;

import org.apache.commons.lang3.time.DateUtils;

import java.sql.Date;
import java.time.LocalDate;

public class DateCalculaterService {

    private static Date getLocalDateTime(String scheduledDate){
        return Date.valueOf(scheduledDate);
    }

    public static boolean isToday(String scheduledDate){
        Date emailDate = getLocalDateTime(scheduledDate);
        Date now = Date.valueOf(LocalDate.now());
        return DateUtils.isSameDay(emailDate, now);
    }
}

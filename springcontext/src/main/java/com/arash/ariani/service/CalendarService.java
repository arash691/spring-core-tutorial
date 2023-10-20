package com.arash.ariani.service;

import java.time.LocalDate;
import java.time.ZoneId;

public class CalendarService {
    public void currentDate() {
        System.out.println("current local date is " + LocalDate.now());
    }

    public void currentDate(String zoneId) {
        System.out.println("current date is " + LocalDate.now(ZoneId.of(zoneId)));
    }
}

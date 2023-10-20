package com.arash.ariani.service;

import java.time.LocalTime;
import java.time.ZoneId;

public class TimeService {
    public void currentTime() {
        System.out.println("current local time is " + LocalTime.now());
    }

    public void currentTime(ZoneId zoneId) {
        System.out.println("current time is " + LocalTime.now(zoneId));
    }
}

package com.arash.ariani.applicationcontext.javaconfig;

import com.arash.ariani.service.CalendarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfig {
    @Bean
    public CalendarService calendarService(){
        return new CalendarService();
    }
}

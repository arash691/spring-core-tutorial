package com.arash.ariani.applicationcontext.javaconfig;

import com.arash.ariani.service.CalendarService;
import com.arash.ariani.service.MathService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Using Class Base Configuration
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationBeanConfig.class);
        CalendarService calendarService = applicationContext.getBean("calendarService", CalendarService.class);
        calendarService.currentDate();
        calendarService.currentDate("Australia/Darwin");
    }
}

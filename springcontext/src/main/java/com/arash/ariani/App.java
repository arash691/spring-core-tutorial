package com.arash.ariani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.ZoneId;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Before Using Spring IoC
        TimeService timeService = new TimeService();
        timeService.currentTime();

        //Using ApplicationContext with xml configuration
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        TimeService timeService1 = applicationContext.getBean("currentTime", TimeService.class);
        timeService1.currentTime();
        timeService1.currentTime(ZoneId.of("UTC"));
    }
}

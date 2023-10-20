package com.arash.ariani.applicationcontext.xml;

import com.arash.ariani.service.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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

        // Get the absolute path of the current directory
        String currentDirectory = System.getProperty("user.dir");

        // Specify the relative path to your XML configuration file
        String relativePath = "/springcontext/src/main/config/spring.xml";
        // Construct the full path
        String configPath = "file:" + currentDirectory + relativePath;


        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext(configPath);
        TimeService timeService2 = applicationContext1.getBean("currentTime", TimeService.class);
        timeService2.currentTime();
        timeService2.currentTime(ZoneId.of("UTC"));
    }
}

package com.arash.ariani.applicationcontext.scannig;

import com.arash.ariani.service.MathService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext("com.arash.ariani.service");
        MathService mathService = applicationContext1.getBean("mathService", MathService.class);
        mathService.abs(-120);
    }
}

package com.arash.ariani.service;

import org.springframework.stereotype.Component;

@Component
public class MathService {
    public void abs(int number) {
        System.out.println("ABS of " + number + " is " + Math.abs(number));
    }
}

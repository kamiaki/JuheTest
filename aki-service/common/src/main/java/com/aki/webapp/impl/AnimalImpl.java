package com.aki.webapp.impl;

import com.aki.webapp.Animal;
import org.springframework.stereotype.Service;

@Service
public class AnimalImpl implements Animal {
    @Override
    public void roar() {
        System.out.println("吼叫");
    }

    @Override
    public void eat() {
        System.out.println("吃吃吃");
    }
}

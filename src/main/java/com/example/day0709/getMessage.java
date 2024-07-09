package com.example.day0709;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component

public class getMessage implements Message{
    @Override
    public void print() {
        System.out.println("this is print");
    }
}

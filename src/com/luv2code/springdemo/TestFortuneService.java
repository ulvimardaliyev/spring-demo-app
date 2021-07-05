package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
public class TestFortuneService implements FortuneService {
    @Value("${email}")
    private String email;
    @Value("${password}")
    private String password;

    private String arr[];

    @PostConstruct
    public void setUpMyArr(){
        System.out.println(">>> Inside PostConstruct method in TestFortuneService");

        arr = new String[2];
        arr[0]=email;
        arr[1]=password;

    }

    private Random random = new Random();


    @Override
    public String getFortune() {
        int index = random.nextInt(arr.length);
        return arr[index];
    }

    /*@PostConstruct
    public void printPostConstructMethod(){
        System.out.println("Inside PostConstructMethod");
        System.out.println("Hello, it's me");
    }

    @PreDestroy
    public void printPreDestroyMethod(){
        System.out.println("Inside PreDestroyMethod");
        System.out.println("Hello, it's you");
    }*/
}

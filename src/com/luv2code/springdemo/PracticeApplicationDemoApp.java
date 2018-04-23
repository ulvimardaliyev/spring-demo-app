package com.luv2code.springdemo;

import com.luv2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PracticeApplicationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_1.xml");

        PingPongCoach coach1 = context.getBean("pingPongCoach",PingPongCoach.class);

        System.out.println(coach1.getDailyWorkOut());

        System.out.println(coach1.getDailyFortune());

        context.close();
    }
}

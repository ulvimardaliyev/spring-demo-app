package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve Bean from context
        Coach coach = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getDailyWorkOut());

        System.out.println(coach.getDailyFortune());

        //System.out.println(coach.printEmail());

        //System.out.println(coach.printPassword());

        context.close();
    }
}

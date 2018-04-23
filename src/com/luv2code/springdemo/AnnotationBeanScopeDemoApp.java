package com.luv2code.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load the Spring app context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve the bean
        Coach coach = context.getBean("tennisCoach", Coach.class);

        Coach alphacoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (coach == alphacoach);

        System.out.println(result);

        System.out.println(coach + " "+ alphacoach);

        context.close();
    }

}

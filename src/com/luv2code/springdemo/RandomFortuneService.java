package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by User on 08-Apr-18.
 */
@Component
public class RandomFortuneService implements FortuneService {

    private String arr[] = {"today is my lucky day",
            "do something",
            "Hello World"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(arr.length);
        return arr[index];
    }
}

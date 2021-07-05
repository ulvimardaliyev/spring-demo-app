package com.luv2code.springdemo;

import com.luv2code.springdemo.Coach;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Inside PingPongCoach of getDailyWorkout() method";
    }

    @Override
    public String getDailyFortune() {
        return "Inside PingPongCoach of getDailyFortune() method";
    }
}

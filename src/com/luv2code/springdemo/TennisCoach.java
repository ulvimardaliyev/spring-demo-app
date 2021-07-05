
package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;




@Component
public class TennisCoach implements Coach {
    /*@Autowired
    @Qualifier("randomFortuneService")*/
    private FortuneService fortuneService;



    public TennisCoach() {
        System.out.println("Inside a TennisCoach Constructor");
    }


   /* @Autowired
    @Qualifier("testFortuneService")
    public void doFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }*/
    /*@Autowired
    @Qualifier("sadFortuneService")
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("Inside a setFortuneService() method");
        this.fortuneService = theFortuneService;
    }*/

    @Override
    public String getDailyWorkOut() {

        return "Practice your backhand valley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }



}

package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main_(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BaseballCoach coach = context.getBean("myBaseballCoach", BaseballCoach.class);
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}

package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}

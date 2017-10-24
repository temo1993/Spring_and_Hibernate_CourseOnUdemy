package main.java.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "configs/applicationContext.xml");
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());
        context.close();
    }
}

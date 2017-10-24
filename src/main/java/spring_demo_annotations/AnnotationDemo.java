package main.java.spring_demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "configs/applicationContext_demo_annotations.xml");

        // get the bean from spring container
        Coach coach = context.getBean("thatSillyCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());

        // close the context
        context.close();
    }
}

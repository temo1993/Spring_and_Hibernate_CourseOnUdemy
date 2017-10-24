package main.java.spring_demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "configs/applicationContext_demo_annotations.xml");

        // get the bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach basketballCoach = context.getBean("basketballCoach", Coach.class);


        // call a method on the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(basketballCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}

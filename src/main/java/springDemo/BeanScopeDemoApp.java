package main.java.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main_(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configs/beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean result = theCoach == alphaCoach;

        // print out the result
        System.out.println("\nPointing to the same object? " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for theCoach: " + alphaCoach + "\n");


        // close the context
        context.close();
    }
}

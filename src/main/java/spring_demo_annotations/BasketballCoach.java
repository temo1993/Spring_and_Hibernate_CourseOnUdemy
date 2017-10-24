package main.java.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice on throwing ball in the basket from 5m distance";
    }
}

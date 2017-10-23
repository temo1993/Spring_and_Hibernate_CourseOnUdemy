package com.luv2code.springDemo;

public class RandomFortuneService implements FortuneService {

    /***
     * <p>Method to get random fortune string value from the array.</p>
     * @return random string from the array.
     */
    @Override
    public String getFortune() {
        String yourFortune[] = new String[5];
        yourFortune[0] = "Today is your lucky day!";
        yourFortune[1] = "Today is exciting day!";
        yourFortune[2] = "Today is very interesting day!";
        yourFortune[3] = "Today is sport challenge day!";
        yourFortune[4] = "Today is a special day!";

        return yourFortune[(int) (Math.random() * yourFortune.length)];
    }
}

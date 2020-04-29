package Занятие10.Container;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RND {
    public String getNick() {
        String alphabet1 = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String alphabet2 = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            builder.append(alphabet1.charAt(ThreadLocalRandom.current().nextInt(0,alphabet1.length())));
            for (int j = 0; j < 5; j++) {
                builder.append(alphabet2.charAt(ThreadLocalRandom.current().nextInt(0,alphabet2.length())));
            }
        }
        return builder.toString();
    }

    public int getPasswordPerson() {
        return 10000000 + (int) ( Math.random() * 9999999 );
    }

    public LocalDate getPersonRegistration() {
        LocalDate minDate = LocalDate.of(1991, 1, 1);
        LocalDate maxDate = LocalDate.of(2020, 1, 1);
        return maxDate.minusDays((long) (Math.random() * (maxDate.toEpochDay() - minDate.toEpochDay())));
    }

    public int getAgeAnimal() {
        return (int) (Math.random() * 20 + 1);
    }
}

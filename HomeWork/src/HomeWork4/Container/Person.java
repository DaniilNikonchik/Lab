package Занятие10.Container;

import java.time.LocalDate;

public class Person {
    private String nick;
    private int password;
    private LocalDate registration;

    public String getNickPerson() {
        return nick;
    }

    public int getPasswordPerson() {
        return password;
    }

    public LocalDate getPersonRegistration() {
        return registration;
    }

    public Person(String nick, int password, LocalDate registration) {
        this.nick = nick;
        this.password = password;
        this.registration = registration;
    }

    @Override
    public String toString() {
        return  '\n' + "Person{" + "Nick: " + nick + ". Password: " + password + ". Registration: " + registration + "}";
    }
}

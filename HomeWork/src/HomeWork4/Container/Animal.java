package Занятие10.Container;

public class Animal {
    private int age;
    private String nick;

    public String getNickAnimal() {
        return nick;
    }

    public int getAgeAnimal() {
        return age;
    }

    public Animal(String nick, int age) {
        this.age = age;
        this.nick = nick;
    }

    @Override
    public String toString() {
        return '\n' + "Animal{" + "Age: " + age + ". Nick='" + nick + '}';
    }
}

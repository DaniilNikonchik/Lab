package Занятие10.Container;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAgeAnimal() > o2.getAgeAnimal() ? - 1 : 0;
    }
}

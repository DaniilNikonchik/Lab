package Занятие10.Container;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ContainerMain {
    public static void main(String[] args) throws IOException {
        RND rnd = new RND();
        int SIZE = 100000;
        DataContainer<Person> dataPerson = new DataContainer<Person>(new Person[SIZE]);
        DataContainer<Animal> dataAnimal = new DataContainer<Animal>(new Animal[SIZE]);
        for (int i = 0; i < SIZE; i++) {
            dataPerson.add(new Person(rnd.getNick(), rnd.getPasswordPerson(), rnd.getPersonRegistration()));
        }

        for (int i = 0; i < SIZE; i++) {
            dataAnimal.add(new Animal(rnd.getNick(), rnd.getAgeAnimal()));
        }

        BufferedWriter writer1 = new BufferedWriter(new FileWriter("DataPerson.txt"));
        writer1.append(Arrays.toString(dataPerson.getData()));

        BufferedWriter writer2 = new BufferedWriter(new FileWriter("DataAnimal.txt"));
        writer2.append(Arrays.toString(dataAnimal.getData()));

        dataPerson.sort(dataPerson, new PersonRegistrationComparator());
        BufferedWriter writer3 = new BufferedWriter(new FileWriter("DataPersonSort.txt"));
        writer3.append(Arrays.toString(dataPerson.getData()));

        dataAnimal.sort(dataAnimal, new AnimalAgeComparator());
        BufferedWriter writer4 = new BufferedWriter(new FileWriter("DataAnimalSort.txt"));
        writer4.append(Arrays.toString(dataAnimal.getData()));

        dataPerson.deleteIndex(8);
        BufferedWriter writer5 = new BufferedWriter(new FileWriter("DataPersonDelete.txt"));
        writer5.append(Arrays.toString(dataPerson.getData()));

        dataAnimal.deleteItem(dataAnimal.getData()[1]);
        BufferedWriter writer6 = new BufferedWriter(new FileWriter("DataAnimalDelete.txt"));
        writer6.append(Arrays.toString(dataAnimal.getData()));
    }
}

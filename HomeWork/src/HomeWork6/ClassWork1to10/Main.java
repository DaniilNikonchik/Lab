package Занятие14.ClassWork1to10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int counter = 0;
        do  {
            try {
                System.out.println("Введите число от 1 до 10: ");
                int number = in.nextInt();
                method(number);
                System.out.println("Вы ввели верно");
                break;
            }
            catch (Exception e){
                in =  new Scanner(System.in);
                counter++;
            }
        }
        while ( counter < 3);
        if (counter == 3) {
            System.out.println("Все попытки были использованы и ни одна из них не верна");
        }
    }

    public static void method(int number){
        if (number < 1 || number > 10) {
            throw new NumberFormatException();
        }
    }
}

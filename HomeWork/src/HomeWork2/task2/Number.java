package by.academy.HW2.task2;

import java.util.Arrays;

public class Number {
    public void sort(int mass[]) {
        Arrays.sort(mass);
        //System.out.println(Arrays.toString(mass));
        long res = 0;
        for (int i = 0; i < mass.length; i++) {
            res ^= mass[i];
        }
        System.out.println(res);
    }

}

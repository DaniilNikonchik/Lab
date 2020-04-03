package by.academy.HomeWork1.task1;

import static java.lang.Math.*;

public class CalculatorWithMath implements ICalculator{

    public double operPlus (double a, double b) {
        return (double) a + b;
    }

    public double operMinus (double a, double b) {
        return (double) a - b;
    }

    public double operMultiply (double a, double b) {
        return (double) a * b;
    }

    public double operShare (double a, double b) {
        // if (b == 0) {
        //     System.out.println("Сannot be divided by zero, zero is replaced by one");
        //     b = 1;
        // }
        return (double) a / b;
    }

    public double operSqrt(int a) {
        return (double) sqrt(a);
    }

    public double operPower (int a, int b) {
        return (double) pow(a, b);
    }

    public double operModule (double a) {
        return (double) abs(a);
    }
}

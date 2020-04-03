package by.academy.HomeWork1.task1;

public class CalculatorWithOperator implements ICalculator {

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
        double t;
        double squareRoot = a / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (a / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }

    public double operPower (int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result*a;
        }
        return result;
    }

    public double operModule (double a) {
        if (a < 0){
            return a * (-1);
        }
        return a;
    }
}
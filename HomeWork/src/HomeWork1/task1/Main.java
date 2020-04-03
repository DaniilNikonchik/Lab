package by.academy.HomeWork1.task1;

public class Main {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double result1; //4.1 + 15 * 7 + (28 / 5) ^ 2
        result1 = (double)calculator.operPlus((calculator.operPlus(calculator.operPower((int)calculator.operShare(28, 5), 2),calculator.operMultiply(15, 7))),4.1);
        System.out.println(result1);

        double result2;
        result2 = (double) calculator.operShare(result1, 0);
        System.out.println(result2);

        double result3;
        result3 = (double) calculator.operShare(result2, 0.0d);
        System.out.println(result3);



    }
}

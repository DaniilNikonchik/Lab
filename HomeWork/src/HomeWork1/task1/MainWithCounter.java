package by.academy.HomeWork1.task1;

public class MainWithCounter {
    public static void main(String[] args) {
        double result1;
        double result2;
        ICalculator calc1 = new CalculatorWithCounter(new CalculatorWithMath());
        ICalculator calc2 = new CalculatorWithCounter(new CalculatorWithOperator());
        result1 = calc1.operPlus((calc1.operPlus(calc1.operPower((int) calc1.operShare(28, 5),2),calc1.operMultiply(15, 7))),4.1);
        result2 = calc2.operPlus((calc2.operPlus(calc2.operPower((int) calc2.operShare(28, 5),2),calc2.operMultiply(15, 7))),4.1);
        System.out.println("CalculatorWithMath "+result1 +" in "+ ((CalculatorWithCounter) calc1).getCountOperation()+" operations.");
        System.out.println("CalculatorWithOperator "+result2 +" in "+ ((CalculatorWithCounter) calc2).getCountOperation()+" operations.");
    }
}

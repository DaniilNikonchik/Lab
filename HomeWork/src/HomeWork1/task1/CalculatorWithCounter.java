package by.academy.HomeWork1.task1;

public class CalculatorWithCounter implements ICalculator {
    private ICalculator calcul;
    private int countOperation = 0;

    public int getCountOperation() {
        return countOperation;
    }

    public CalculatorWithCounter(ICalculator calcul) {
        this.countOperation++;
        this.calcul = calcul;
    }

    @Override
    public double operPlus(double a, double b) {
        this.countOperation++;
        return calcul.operPlus(a,b);
    }

    @Override
    public double operMinus(double a, double b) {
        this.countOperation++;
        return calcul.operMinus(a,b);
    }

    @Override
    public double operMultiply(double a, double b) {
        this.countOperation++;
        return calcul.operMultiply(a,b);
    }

    @Override
    public double operShare(double a, double b) {
        this.countOperation++;
        return calcul.operShare(a,b);
    }

    @Override
    public double operSqrt(int a) {
        this.countOperation++;
        return calcul.operSqrt(a);
    }

    @Override
    public double operPower(int a, int b) {
        this.countOperation++;
        return calcul.operPower(a,b);
    }

    @Override
    public double operModule(double a) {
        this.countOperation++;
        return calcul.operModule(a);
    }
}

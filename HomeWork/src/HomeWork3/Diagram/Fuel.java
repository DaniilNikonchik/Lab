package HomeWork3.Diagram;

public class Fuel extends Motor implements ICar {
    public boolean fullTank(boolean i) {
        return true;
    }

    public boolean emptyTank(boolean i) {
        return false;
    }
}

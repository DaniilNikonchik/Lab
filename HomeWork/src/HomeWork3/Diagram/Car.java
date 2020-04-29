package HomeWork3.Diagram;

public class Car extends Man implements ICar {
    Passenger passenger = new Passenger();
    Wheels wheels = new Wheels();
    Motor motor = new Motor();
    Doors doors = new Doors();
    Lock lock = new Lock();
    Fuel fuel = new Fuel();
    Seat seat = new Seat();
    Man man = new Man();

    public boolean startUp(boolean i) {
        return true;
    }

    public boolean stalled(boolean i) {
        return false;
    }

    public boolean go(boolean i) {
        return true;
    }

    public boolean stand(boolean i) {
        return false;
    }
}

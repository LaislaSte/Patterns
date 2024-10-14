package composite;

public class Car {
    private Engine engine;

    public Car() {
        engine = new Engine(); // Composition: Car contains Engine
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is ready to go!");
    }
}
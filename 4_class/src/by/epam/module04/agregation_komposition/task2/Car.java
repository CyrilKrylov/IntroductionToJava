package by.epam.module04.agregation_komposition.task2;

public class Car {

    private Brand brand;
    private Wheel[] wheels;
    private Engine engine;
    private final int tankVolume;
    private int currentTankVolume;

    public Car(Brand brand, Wheel[] wheels, Engine engine, int tankVolume) {
        this.brand = brand;
        this.wheels = wheels;
        this.engine = engine;
        this.tankVolume = tankVolume;
        this.currentTankVolume = tankVolume;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public int getCurrentTankVolume() {
        return currentTankVolume;
    }

    public void setCurrentTankVolume(int currentTankVolume) {
        this.currentTankVolume = currentTankVolume;
    }
}

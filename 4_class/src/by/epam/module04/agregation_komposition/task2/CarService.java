package by.epam.module04.agregation_komposition.task2;

public class CarService {

    private EngineService engineService;
    private WheelService wheelService;
    private Car car;
    private static final int PART_OF_TRIP_FUEL = 3;

    public CarService(Car car) {
        this.engineService = new EngineService(car.getEngine());
        this.wheelService = new WheelService(car.getWheels());
        this.car = car;
    }

    public void go() {
        if (this.engineService.isEngineStarted()) {
            System.out.println("Машина уже едет");
            return;
        }

        if (car.getCurrentTankVolume() > 0) {
            engineService.startEngine();
            wheelService.startAllWheels();
            System.out.println("Машина поехала");
        } else {
            System.out.println("Пустой бак");
        }

    }

    public void stop() {
        if (!this.engineService.isEngineStarted()) {
            System.out.println("Машина уже стоит");
            return;
        }
        int spentFuel;
        int remainingFuel;

        spentFuel = car.getTankVolume() / PART_OF_TRIP_FUEL;
        remainingFuel = car.getCurrentTankVolume() - spentFuel;
        engineService.stopEngine();
        wheelService.stopAllWheels();
        car.setCurrentTankVolume(remainingFuel);
        System.out.println("Машина остановилась");
    }

    public void fillUp() {
        car.setCurrentTankVolume(car.getTankVolume());
    }

    public void showCarBrand() {
        System.out.println(car.getBrand());
    }



}

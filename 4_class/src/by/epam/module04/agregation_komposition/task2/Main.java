package by.epam.module04.agregation_komposition.task2;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля*/

public class Main {

    public static void main(String[] args) {
        Car car = new Car(Brand.BMV,
                new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()},
                new Engine(),
                60);
        CarService carService = new CarService(car);

        carService.go();
        carService.go();
        carService.stop();
        carService.stop();
        System.out.println("-------------");
        carService.go();
        carService.stop();
        carService.go();
        carService.stop();
        carService.go();
        carService.stop();
        carService.fillUp();
        carService.go();
        carService.stop();
        carService.showCarBrand();
    }

}

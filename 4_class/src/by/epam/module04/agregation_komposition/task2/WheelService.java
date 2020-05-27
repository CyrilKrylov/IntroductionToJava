package by.epam.module04.agregation_komposition.task2;

public class WheelService {

    private Wheel[] wheels;

    public WheelService(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void stopAllWheels() {
        for (Wheel wheel : this.wheels) {
            this.stopWheel(wheel);
        }
    }

    public void startAllWheels() {
        for (Wheel wheel : this.wheels) {
            this.startWheel(wheel);
        }
    }

    public void replaceWheel(Wheel newWheel, int indexOfWheel) {
        if (indexOfWheel > wheels.length - 1) {
            System.out.println("Колесо не удалось заменить");
            return;
        }

        wheels[indexOfWheel] = newWheel;
    }

    private void stopWheel(Wheel wheel) {
        wheel.setWheelTurn(false);
    }

    private void startWheel(Wheel wheel) {
        wheel.setWheelTurn(true);
    }


}

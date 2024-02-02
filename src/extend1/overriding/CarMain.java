package extend1.overriding;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.move();

        GasCar gCar = new GasCar();
        gCar.move();
    }
}

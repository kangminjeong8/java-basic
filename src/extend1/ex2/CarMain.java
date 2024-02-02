package extend1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.move();
        eCar.charge();
        eCar.openDoor();

        GasCar gCar = new GasCar();
        gCar.move();
        gCar.fillUp();
        gCar.openDoor();

        HydrogenCar hCar = new HydrogenCar(); //상속 관계 덕분에 중복은 줄어들고, 새로운 수소차를 편리하게 확장한 것을 알 수 있다.
        hCar.move();
        hCar.openDoor();
        hCar.fillHydrogen();
    }
}

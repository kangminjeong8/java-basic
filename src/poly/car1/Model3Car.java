package poly.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3Car 시동을 켭니다.");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3Car 시동을 끕니다.");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car 악셀을 밟습니다.");
    }
}

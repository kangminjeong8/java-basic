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

    //1. 확장에 열려있다는 의미: Car 인터페이스를 사용해서 새로운 차량을 자유롭게 추가할 수 있다.
    //2. 코드 수정은 닫혀있다는 의미: 새로운 차를 추가하게 되면 기능이 추가되기 때문에 기존 코드의 수정은 불가피 하다.
    //3. 변하지 않는 부분: Car 인터페이스를 사용하는 클라이언트인 Driver의 코드를 수정하지 않아도 된다.
}

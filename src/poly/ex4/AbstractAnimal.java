package poly.ex4;

public abstract class AbstractAnimal {

    //추상 메서드가 있으면 추상 클래스로 선언해야 한다.
    //메서드 바디 부분이 없다. 자식 클래스가 반드시 오버라이딩 해야 한다.
    //실행 로직을 전혀 가지고 있지 않다. 다형성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.
    public abstract void sound();
    public abstract void move();

}

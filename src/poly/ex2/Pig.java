package poly.ex2;

public class Pig extends Animal {
    //todo sound 오버라이딩 하는 것을 빠트릴 수 있다. 이렇게 되면 부모의 기능을 상속 받는다. 따라서 코드상 아무런 문제는 발생하지 않지만 부모 클래스에 있는 Animal.sound() 메소드가 호출된다.
}

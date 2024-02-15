package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {

        //부모 클래스의 기능을 자식 클래스가 상속 받을 때, 클래스는 상속 받는다고 표현하지만, 부모 인터페이스의 기능을 자식이 상속 받을 때는 인터페이스를 구현한다고 표현한다.
        //인터페이스는 모든 메서드가 추상 메서드이다.
        //인터페이스는 메서드 이름만 있는 설계도이고, 이 설계도는 하위 클래스에서 모두 구현해야 한다.
        //인터페이스를 사용해야 하는 이유
        //1. 제약: 순수 추상 클래스의 경우 누군가 실행 가능한 메서드를 끼워 넣을 수 있다. 하지만 인터페이스의 경우 모든 메서드가 추상 메서드이다.
        //2. 다중 구현: 자바에서 클래스 상속은 부모를 하나만 지정할 수 있다. 반면에 인터페이스는 부모를 여러명 두는 다중 구현이 가능하다.

        //인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        InterfaceAnimal dog = new Dog();
        InterfaceAnimal cat = new Cat();
        InterfaceAnimal caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}

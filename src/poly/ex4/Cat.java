package poly.ex4;

public class Cat extends AbstractAnimal {

    //추상 메서드 구현
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }

}

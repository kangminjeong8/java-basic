package poly.ex4;

public class Caw extends AbstractAnimal {
    //추상 메서드 구현
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }


}

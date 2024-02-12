package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animalArr = {dog, cat, caw}; //같은 타입의 데이터를 나열할 수 있다.
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound(); //메서드 오버라이딩에 의해 각 인스턴스의 오버라이딩 된 sound() 메서드가 호출된다.
            System.out.println("동물 소리 테스트 종료");
        }

    }
}

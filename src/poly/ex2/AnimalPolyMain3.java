package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {


        Animal a = new Animal(); //다형성을 위해서 필요한 것이지 직접 인스턴스를 생성해서 사용할 일은 없다.
        a.sound();

        //새로운 기능이 추가되었을 때 변하는 부분을 최소화 하는 것이 잘 작성된 코드이다. 이렇게 하기 위해서는 코드에서 변하는 부분과 변하지 않는 부분을 명확하게 구분하는 것이 좋다.
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()}; //같은 타입의 데이터를 나열할 수 있다.
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //메서드 오버라이딩에 의해 각 인스턴스의 오버라이딩 된 sound() 메서드가 호출된다.
        System.out.println("동물 소리 테스트 종료");
    }
}

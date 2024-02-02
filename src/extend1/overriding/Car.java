package extend1.overriding;

public class Car { //부모 클래스: 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    //추가
    public void openDoor() {
        System.out.println("차의 문을 엽니다.");
    }

}

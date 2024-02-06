package extend1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); //생성자는 하나만 호출할 수 있다. 두 생성자 중에 하나만 선택하면 된다. ClassB에는 기본 생성자가 없어서 super()를 사용하거나 생략할 수 없다.
        System.out.println("ClassC 생성자");
    }

    //정리하자면
    //상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다. 따라서 부모의 데이터를 먼저 초기화 하고 그 다음에 자식의 데이터를 초기화 한다.
    //상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 super를 호출해야 한다. 단 기본 생성자인 경우 생략할 수 있다.
}

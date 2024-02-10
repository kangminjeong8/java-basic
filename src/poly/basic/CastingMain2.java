package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //부모는 자식을 담을 수 있다.
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child)poly; //x001: 부모 타입을 사용하는 변수를 자식 타입에 대입하려고 하면 컴파일 오류 발생, 자식은 부모를 담을 수 없다.
        child.childMethod();

        //일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
        //정확히는 poly가 child의 타입으로 바뀌는 것은 아니다.
        ((Child) poly).childMethod(); //연산자 우선순위

    }
}

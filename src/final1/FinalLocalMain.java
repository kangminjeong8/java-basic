package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
        method(10);
    }
        static void method(final int parameter) { //매개변수에 final 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다. 따라서 메서드 호출 시점에 사용된 값이 끝까지 사용된다.
            //parameter = 20; //컴파일 오류
        }
}

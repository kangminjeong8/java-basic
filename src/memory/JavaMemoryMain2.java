package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
        //x001 참조값을 가진 Data 인스턴스를 참조하는 곳이 더는 없다.
        //참조하는 값이 없으므로 사용되는 곳도 없다. 결과적으로 프로그램에서는 더는 사용하지 않는 객체
        //GC는 이렇게 참조가 모두 사라진 인스턴스를 찾아 메모리에서 제거한다.
    }

    static void method1() { //method1()에서 method2()를 호출할 때 매개변수에 Data 인스턴스의 참조값을 전달한다.
        System.out.println("method1 start");
        Data data1 = new Data(10); //힙 영역에 Data 인스턴스를 생성한다. 그리고 참조값을 dta1에 보관한다.

        //method2()를 호출하면서 Data data2 매개변수에 x001 참조값을 넘긴다.
        //이제 method1()에 있는 data1과 method2()에 있는 data2 지역 변수는 둘 다 같은 x001 인스턴스를 참조한다.
        method2(data1);

        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end"); //종료될 때 스택 프레임이 제거되면서 매개변수 data2도 함께 제거된다.
    }
    
    //정리
    //지역변수는 스택 영역에, 객체는 힙 영역에 관리된다.
    //static-메서드 영역과 밀접한 연관이 있다.
}

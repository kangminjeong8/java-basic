package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //정리
        //static 변수는 쉽게 이야기해서 클래스인 붕어빵 틀이 특별히 관리하는 변수이다. 붕어빵 틀은 1개이므로 클래스 변수도 하나만 존재한다.
        //반면에 인스턴스인 붕어빵은 인스턴스의 수 만큼 변수가 존재한다.

        //추가
        //인스턴스를 통한 접근은 가능하나 권장하지 않는다. 코드를 읽을 때 마치 인스턴스 변수에 접근하는 것 처럼 오해할 수 있다.
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + Data3.count);

        //클래스를 통한 접근
        System.out.println(Data3.count);

    }
}

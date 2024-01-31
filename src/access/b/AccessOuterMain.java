package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 default 호출 불가
        //data.defaultField = 2;
        //data.defaultMethod();

        //priavate 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess(); //외부에서 호출되었지만 해당 메서드 안에서는 자신의 private 필드와 메서드에 접근할 수 있다. 생성자도 접근 제어자 관점에서 메서드와 같다.
    }
}

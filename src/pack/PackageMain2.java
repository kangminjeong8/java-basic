package pack;

import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import시 경로 생략하고 클래스 이름만 적을 수 있음
        User2 user2 = new User2();
    }
}

package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); // 사용자와 같은 위치: 패키지 경로 생략
        pack.a.User user = new pack.a.User(); // 사용자와 다른 위치: 패키지 전체 경로를 포함해서 클래스 적어주어야 함
    }
}

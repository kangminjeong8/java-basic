package construct;

public class MemberDefault {

    String name;

    // 기본 생성자를 왜 자동으로 만들어줄까?
    // 만약 자바에서 기본 생성자를 만들어주지 않는다면 생성자 기능이 필요하지 않은 경우에도 모든 클래스에 개발자가 직접 기본 생성자를 정의해야 한다.
    // 생성자 기능을 사용하지 않는 경우도 많기 때문에 이런 편의 기능을 제공한다.
    // 생성자가 하나라도 있을 때는 기본 생성자가 제공되지 않는다.
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}

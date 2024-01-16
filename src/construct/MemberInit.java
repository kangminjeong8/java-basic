package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    //initMember는 Member에 초기값 설정 기능을 제공하는 메서드
    //멤버변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위가 됨
    //여기서 this는 인스턴스 자신의 참조값을 가리킨다.
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}

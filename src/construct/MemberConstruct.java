package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    // 생성자는 메서드와 비슷하지만 차이가 있다.
    // 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫글자도 대문자로 시작한다.
    // 생성자는 반환 타입이 없다. 비워두어야 한다.
    // 나머지는 메서드와 같다.
    // 제약의 장점: 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 한다는 점이다. 참고로 생성자를 메서드 오버로딩처럼 여러개 정의할 수 있는데, 이 경우 하나만 호출하면 된다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 추가(생성자 오버로딩)
    // this()를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있다. 이 부분을 잘 활용하면 지금과 같이 중복을 제거할 수 있다.
    // this()는 생성자 코드의 첫줄에만 작성할 수 있다.
    MemberConstruct(String name, int age) {
        //System.out.println("go!");
        this(name, age, 50); // this는 인스턴스 자신의 참조값을 가리킨다. 그래서 자기 자신의 생성자를 호출한다고 생각하면 된다.
    }

}

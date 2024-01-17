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

}

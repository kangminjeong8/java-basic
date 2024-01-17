package construct;

public class ConstructMain1 {

    public static void main(String[] args) {

    // new ~ : 인스턴스를 생성하고 즉시 해당 생성자를 호출한다.
    // 참고로 new 키워드를 사용해서 객체를 생성할 때 마지막에 괄호도 포함해야 하는 이유가 바로 생성자 때문이다. (객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함한다)
    MemberConstruct member1 = new MemberConstruct("user1", 14, 90);
    MemberConstruct member2 = new MemberConstruct("user2", 16, 100);

    MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }

    }


}

package final1;

public class FinalFeildMain {

    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FeildInit feildInit1 = new FeildInit(); //모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리 낭비(그래서 아래처럼 static final 같이 사용하는 것이 효과적)
        FeildInit feildInit2 = new FeildInit();
        FeildInit feildInit3 = new FeildInit();

        System.out.println(feildInit1.value);
        System.out.println(feildInit2.value);
        System.out.println(feildInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FeildInit.CONST_VALUE);
    }
}

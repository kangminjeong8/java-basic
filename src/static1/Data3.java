package static1;

public class Data3 {

    //멤버 변수의 종류
    //1. 인스턴스 변수: static이 붙지 않은 멤버 변수로 인스턴스를 생성해야 사용할 수 있고, 인스턴스를 만들 때 마다 새로 만들어진다.
    //2. 클래스 변수: static이 붙은 멤버 변수로 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다. 딱 1개만 만들어지고 여러곳에서 공유하는 목적으로 사용된다.
    public String name;
    public static int count; //static: 정적 변수, 클래스 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }

}

package access.a;

public class PublicClass { //외부 접근 가능
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

    class DefaultClass1 { //같은 패키지 내부에서만 접근 가능

    }

    class DefaultClass2 {

    }


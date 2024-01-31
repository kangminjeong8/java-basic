package access.ex;

public class MaxCounter {

    private int count;
    private int max;

    //조건: 해당 클래스는 다른 패키지에서도 사용 가능하게
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증 로직: 통과 못하면 실행 로직으로 넘어가지 않게
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        //실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }

}

package access;

public class Speaker {

    // 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것
    // private: 나의 클래스 안으로 속성과 기능을 숨길 때 사용, 외부 클래스에서 해당 기능을 호출할 수 없다.
    // default: 나의 패키지 안으로 속성과 기능을 숨길 때 사용, 외부 패키지에서 해당 기능을 호출할 수 없다.
    // protected: 상속 관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
    // public: 기능을 숨기지 않고 어디서든 호출할 수 있게 공개한다.
    private int volume; // private 사용해서 모든 외부 호출 막기

    Speaker(int volume) { // 생성자를 통해서 초기 음량 지정
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volume down");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}

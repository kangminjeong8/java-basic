package access;

public class Speaker {
    int volume;

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

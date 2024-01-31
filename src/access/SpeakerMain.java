package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        // Speaker 객체를 사용하는 사용자는 Speaker의 Volume 필드와 메서드에 모두 접근할 수 있다.
        // VolumeUp()과 같은 메서드를 만들어서 음량이 100을 넘지 못하도록 기능을 개발했지만 소용이 없다.
        // 왜냐하면 Speaker를 사용하는 입장에서는 volume 필드에 직접 접근해서 원하는 값을 설정할 수 있기 때문이다.
        // 그래서 외부 접근을 막을 수 있는 방법이 필요하다. -> 접근 제어자
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; // private 접근 오류
        speaker.showVolume();
    }
}

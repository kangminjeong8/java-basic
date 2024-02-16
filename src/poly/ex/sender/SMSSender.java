package poly.ex.sender;

public class SMSSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 보냅니다. " + message);
    }
}

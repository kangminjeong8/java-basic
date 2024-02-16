package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService service = new PayService();

        //kakao
        String payOption = "kakao";
        int amount1 = 5000;
        service.processPay(payOption, amount1);

        //naver
        String payOption2 = "naver";
        int amount2 = 10000;
        service.processPay(payOption2, amount2);

        //잘못된 결제수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        service.processPay(payOption3, amount3);
    }
}

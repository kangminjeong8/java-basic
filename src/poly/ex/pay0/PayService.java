package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {

        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        if(option.equals("naver")) {
            NaverPay naver = new NaverPay();
            result = naver.pay(amount);
        } else if (option.equals("kakao")){
            KakaoPay kakao = new KakaoPay();
            result = kakao.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if(result) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}

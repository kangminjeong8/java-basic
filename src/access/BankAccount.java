package access;

public class BankAccount {

    //데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다.
    private int balance; //데이터 필드는 외부에 직접 노출하지 않는다. BankAccount가 제공하는 메서드를 통해서만 접근할 수 있다.

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit(입금)
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("금액이 유효하지 않습니다.");
        }
    }

    // public 메서드 : withdraw(출금)
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("금액이 유효하지 않습니다.");
        }
    }

    // public 메서드 : getBalance(잔액 조회)
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) { //입력 금액을 검증하는 기능은 내부에서만 필요한 기능이다. 따라서 private 사용
        //금액이 0보다 커야 함
        return amount > 0;
    }
}

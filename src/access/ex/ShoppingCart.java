package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;

        /*
        if (itemCount < items.length) {
                items[itemCount] = item;
                itemCount++;
        } else {
            System.out.println("장바구니는 10개 이상 담을 수 없습니다");
        } */
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품 이름: " + items[i].getName() + ", 상품 가격: " + items[i].getTotalPrice());
        }
        System.out.println("총 가격: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;

        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }

        /*
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }*/
        return totalPrice;
    }

}
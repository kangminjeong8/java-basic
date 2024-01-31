package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("커피", 1000, 1);
        Item item2 = new Item("과자", 2000, 2);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }

}

package date20250903;


public class Sample {
    public static void main(String[] args) {

        // int型をPrice型に変更する
        Item apple = new Item("apple", new Price(100, Currency.YEN));
        Item banana = new Item("banana", new Price(80, Currency.YEN));
        Item orange = new Item("orange", new Price(120, Currency.YEN));

        Order order = new Order(apple, 3);
        Order order2 = new Order(banana, 5);
        Order order3 = new Order(orange, 2);

        ShoppingCart cart = new ShoppingCart();
        cart.add(order);
        cart.add(order2);
        cart.add(order3);

        Price result = cart.calcTotal();
        System.out.println(result.intValue());

    }
}

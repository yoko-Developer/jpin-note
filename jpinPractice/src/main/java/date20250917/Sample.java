package date20250917;


public class Sample {
    public static void main(String[] args) {

        // int型をPrice型に変更する
        Item apple = new Item("apple", Price.ofYen(100));
        Item banana = new Item("banana", Price.ofYen(80));
        Item orange = new Item("orange", Price.ofYen(120));

        Order order = new Order(apple, new Quantity(3));
        Order order2 = new Order(banana, new Quantity(5));
        Order order3 = new Order(orange, new Quantity(2));

        ShoppingCart cart = new ShoppingCart();
        cart.add(order);
        cart.add(order2);
        cart.add(order3);

        Price result = cart.calcTotal();
        System.out.println(result.intValue());
    }
}

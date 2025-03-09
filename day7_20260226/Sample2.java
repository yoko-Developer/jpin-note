public class Sample2 {

    public static void main(String[] args) {

//		Item apple = new Item();
//		apple.setName("apple");
//		apple.setPrice(100);

//		Item banana = new Item();
//		banana.setName("banana");
//		banana.setPrice(80);

//		Item orange = new Item();
//		orange.setName("orange");
//		orange.setPrice(120);

        Item apple = new Item("apple", 100);
        Item banana = new Item("banana", 80);
        Item orange = new Item("orange", 120);

        Order o1 = new Order(apple, 3);
        Order o2 = new Order(banana, 2);
        Order o3 = new Order(orange, 4);

        ShoppingCart cart = new ShoppingCart();
        cart.add(o1);
        cart.add(o2);
        cart.add(o3);

        int total = cart.getTotal();
        System.out.println(total);
    }

}

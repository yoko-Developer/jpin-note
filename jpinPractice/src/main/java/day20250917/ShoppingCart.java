package day20250917;

import day20250917.Order;
import day20250917.Price;

public class ShoppingCart {

    private Order[] orders = new Order[10];
    private int index = 0;

    public void add(Order order) {
        this.orders[index] = order;
        this.index++;
    }

    public Price calcTotal() {

        Price result = new Price(0, Currency.YEN);

        for (int i = 0; i < this.index; i++) {
            Order order = this.orders[i];
            result = result.plus(order.calcSubTotal()); // plusメソッドを使うことで異なる通貨の足し算をしなくて良い(円とドルなど)
        }

        return result;
    }
}

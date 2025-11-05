package date20250917;

public class ShoppingCart {

    private Order[] orders = new Order[10];
    private int index = 0;

    public void add(Order order) {
        this.orders[index] = order;
        this.index++;
    }

    public Price calcTotal() {

//        Price result = new Price(0, Currency.YEN);
        // ofYenメソッドを使ってコンストラクタを呼び出す(F3で確認できる)
        Price result = Price.ofYen(0);

        for (int i = 0; i < this.index; i++) {
            Order order = this.orders[i];
            result = result.plus(order.calcSubTotal()); // plusメソッドを使うことで異なる通貨の足し算をしなくて良い(円とドルなど)
        }

        return result;
    }
}

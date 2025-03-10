public class Order {
    private final Item item;
    // このままだとマイナスの値になってしまうのでqtyクラスを作成する
    private final Quantity qty;

    public Order(Item item, Quantity qty) {
        this.item = item;
        this.qty = qty;
    }

    public Price getTotal() {
        return this.item.calc(qty);
    }
}

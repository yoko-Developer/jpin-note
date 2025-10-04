package day20250910;

public class Order {

    // 前回はqtyクラスを分けた
    private Item item;
    private int qty;

    public Order(Item item, int qty) {
        this.item = item;
        this.qty = qty;
    }

    public Price calcSubTotal() {
        Price result = item.multi(this.qty);
        return result;
    }

    public Item getItem() {
        return item;
    }
    public int getQty() {
        return qty;
    }
}

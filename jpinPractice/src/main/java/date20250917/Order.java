package date20250917;

public class Order {

    private Item item;
    private Quantity qty;

    public Order(Item item, Quantity qty) {
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
    public Quantity getQty() {
        return qty;
    }
}

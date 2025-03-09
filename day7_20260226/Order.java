public class Order {
    private Item item;
    private int qty; // quantity

    public Order(Item item, int qty) {
        this.item = item;
        this.qty = qty;
    }

    public int getTotal() {
        return this.item.getPrice() * this.qty;
    }

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int quantity) {
        this.qty = quantity;
    }
}

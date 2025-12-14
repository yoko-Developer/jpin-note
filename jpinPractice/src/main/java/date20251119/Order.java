package date20251119;

public class Order {

    private final Item item;
    private Quantity qty;

    public Order(Item item, Quantity qty) {
        super();

        if (item == null || qty == null) {
            throw new IllegalArgumentException();
        }
        this.item = item;
        this.qty = qty;
    }

    public void increase() {
        this.qty = this.qty.increase();
    }

    /**
     * 数量を返す
     * @return
     */
    public Object getQty() {
        return this.qty;
    }

    public void decrease() {
        this.qty = this.qty.decrease();
    }

    public boolean canIncrease() {
        return this.qty.canIncrease();
    }

    public boolean canDecrease() {
        return false;
    }

    public Price calcSubTotal() {
        return item.calcSubTotal(this.qty);
    }

}

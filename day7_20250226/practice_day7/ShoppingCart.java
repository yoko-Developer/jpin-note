public class ShoppingCart {
    private Order[] orders = new Order[10];
    private int index = 0;

    public void add(Order order) {
        this.orders[this.index] = order;
        this.index++;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.index; i++) {
            total += this.orders[i].getTotal();
        }
        return total;
    }
}

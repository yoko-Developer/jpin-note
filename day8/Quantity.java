public class Quantity {
    private final int amount;

    public Quantity(int amount) {

        if (amount < 0 || 100000 < amount) {
            System.out.println("不正な数値です");
            System.exit(0);
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

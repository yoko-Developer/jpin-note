package date20251119;

import java.util.Objects;

public class Quantity {
    private final int amount;
    private final static int MIN = 0;
    private final static int MAX = 99;
    public Quantity(int amount) {
        super();
        if (amount < 0 || 99 < amount) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }
    public int intValue() {
        return this.amount;
    }

    public Quantity increase() {
        return new Quantity(this.amount + 1);
    }

    public Quantity decrease() {
        return new Quantity(this.amount - 1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Quantity other = (Quantity) obj;
        return amount == other.amount;
    }

    public boolean canIncrease() {
        // 今の数量がMAXより小さい場合は増やせる
        return this.amount < MAX;
    }


    public boolean canDecrease() {
        return this.amount > MIN;
    }

    public Price subtotal(Price price) {
        Price result =new Price(0);
        for (int i = 0; i < this.amount; i++) {
            result = result.plus(price);
        }
        return result;
    }

    public Price times(Price p) {

        Price result = new Price(0);
        for (int i = 0; i < this.amount; i++) {
            result = result.plus(p);
        }
        return result;
    }
}

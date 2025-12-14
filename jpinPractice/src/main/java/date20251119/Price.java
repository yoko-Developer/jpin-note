package date20251119;

import java.util.Objects;

public class Price {

    private final int amount;

    public Price(int amount) {
        if (amount < 0 || 999999 < amount) {
            throw new IllegalArgumentException("価格はマイナスにできません");
        }
        this.amount = amount;
    }

    public int intValue() {
        return this.amount;
    }

//    public Price plus(Price other) {
//        return new Price(this.amount + other.amount);
//    }

    /**
     * 足し算
     * @param other
     * @return
     */
    public Price plus(Price other) {
        if (other == null) {
            throw new IllegalArgumentException();
        }

        try {
            return new Price(this.amount + other.amount);
        } catch (IllegalArgumentException e) {
            throw new OutOfRangeException();
        }
    }

//    public Price minus(Price other) {
//        return new Price(this.amount - other.amount);
//    }

    /**
     * 引き算
     * @param other
     * @return
     */
    public Price minus(Price other) {
        if (other == null) {
            throw new IllegalArgumentException();
        }
//        return new Price (this.amount - other.amount);
        try {
            return new Price(this.amount - other.amount);
        } catch (IllegalArgumentException e) {
            throw new OutOfRangeException();
        }
    }

    public Price multi(Quantity q) {
        return q.times(this);
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
        Price other = (Price) obj;
        return amount == other.amount;
    }
}

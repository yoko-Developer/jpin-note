package date20251119;

public class Price {

    private final int amount;

    public Price(int amount) {
        if (amount < 0 || 999999 < amount) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

    public int intValue() {
        return this.amount;
    }

//    public Price plus(Price other) {
//        return new Price(this.amount + other.amount);
//    }

    public Price plus(Price other) {
        if (other == null) {
            throw new IllegalArgumentException();
        }
        return new Price(this.amount + other.amount);
    }

//    public Price minus(Price other) {
//        return new Price(this.amount - other.amount);
//    }

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
}

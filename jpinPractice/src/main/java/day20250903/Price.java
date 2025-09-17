package day20250903;


public class Price {

    private final int amount;
    private final Currency currency;

    public Price(int amount, Currency currency) {

        if (amount < 0 || 10000 < amount) {
            System.out.println("invalid price");
            System.exit(0);
        }

        this.amount = amount;
        this.currency = currency;
    }

    public int intValue() {
        return this.amount;
    }

    public Price plus(Price other) {

        if (this.currency != other.currency) {
            System.out.println("invalid currency");
            System.exit(0);
        }

        return new Price(this.amount + other.amount, currency);
    }
}

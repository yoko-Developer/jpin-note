package date20250910;

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

    public static Price ofYen(int amount) {
        return new Price(amount, Currency.YEN);
    }

    public int intValue() {
        return this.amount;
    }

    // 剥き出しのデータを使ってる
    // データとルールをセットにするためにQuantityクラスを作る(Priceクラスを参考にする)
    public Price plus(Price other) {

        // 通貨の種類が違う場合
        if (this.currency != other.currency) {
            System.out.println("invalid currency");
            System.exit(0);
        }

        return new Price(this.amount + other.amount, currency);
    }
}

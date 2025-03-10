public class Price {

    private  final int amount;

    public Price(int amount) {
        super();

        if (amount < 0 || 100000 < amount) {
            System.out.println("不正は価格設定です");
            System.exit(0);
        }

        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Price multi(Quantity size) {
        // 自分自身が持っている値の掛け算
        return new Price(this.amount * size.getAmount());
    }

    public Price add(Price price) {
        return new Price(this.amount + price.amount);
    }
}

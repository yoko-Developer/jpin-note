package date20251119;


public class Item<P extends Price> {
    private final String name;
    private final P price;

    public Item(String name, P price) {

        // 名前と価格にnullは使えない
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        // 名前に空文字は使えない
        if (name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        // 価格にnullは使えない
        if (price == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public P getPrice() {
        return price;
    }

    public Price calcSubTotal(Quantity quantity) {
        return this.price.multi(quantity);
    }
}

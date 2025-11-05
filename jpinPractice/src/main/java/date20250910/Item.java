package date20250910;

public class Item {

    private String name;
    private Price price;

    public Item(String name, Price price) {

        if (name == null || "".equals(name)) {
            System.out.println("name is required");
            System.exit(0);
        }

        if (price == null) {
            System.out.println("invalid price");
            System.exit(0);
        }

        this.name = name;
        this.price = price;
    }

    // メソッドを追加、数量の数だけ足し算をすれば良い
    // これで掛け算ができるようになった
    public Price multi(Quantity qty) {
//        Price result = new Price(0, Currency.YEN);
//        for (int i = 0; i < qty; i++) {
//            result = result.plus(this.price);
//        }
        return qty.calc(this.price);
    }
}

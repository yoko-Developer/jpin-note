package day20250903;

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

    public Price multi(int qty) {
        Price result = new Price(0, Currency.YEN);
        for (int i = 0; i < qty; i++) {
            result = result.plus(this.price);
        }
        return result;
    }

}

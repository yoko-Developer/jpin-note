package date20251119;

public class Item {
    private final String name;
    private final Price price;

    public Item(String name, Price price) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
        }

}

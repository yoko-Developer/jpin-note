public class Item {

    private final String name;
    private final Price price;

    public Item(String name, Price price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public Item modefy(Price price) {
        return new Item(this.name, price) ;
    }

    public Price calc(Quantity qty) {
        return this.price.multi(qty);
    }
}

package date20251119;

public class Value<T> {

    private T contents;
    public Value(T contents) {
        super();
        this.contents = contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
}

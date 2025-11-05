package date20251105.chain;

public class Builder {
    public static AbstractChain build() {
        AbstractChain a = new A();
        a
                .next(new B())
                .next(new C());
        return a;
    }
}

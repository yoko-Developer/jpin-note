package date20251105.chain;

// AやBの存在は知らないストラテジパターン
public abstract class AbstractChain {

    private Type type;
    private AbstractChain next;

    public AbstractChain(Type type) {
        this.type = type;
    }

    public void execute(Type type) {
        if (this.type == type) {
            this.perform();
            return;
        }
        if (this.next == null) {
            throw new IllegalArgumentException();
        }
        this.next.execute(type);
    }

    abstract void perform();

    public AbstractChain next(AbstractChain target) {
        if (this.next == null) {
            this.next = target;
            return target;
        } else {
            this.next.next(target);
            return target;
        }

    }
}

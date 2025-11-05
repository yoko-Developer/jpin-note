package date20251105.chain;

class B extends AbstractChain {
    public B() {
        super(Type.B);
    }

    @Override
    void perform() {
        System.out.println("B");
    }
}

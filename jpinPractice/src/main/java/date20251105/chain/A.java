package date20251105.chain;

class A extends AbstractChain {
    public A() {
        super(Type.A);
    }

    @Override
    void perform() {
        System.out.println("A");
    }
}

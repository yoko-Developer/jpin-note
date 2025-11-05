package date20251105.chain;

class C extends AbstractChain{
    public C() {
        super(Type.C);
    }

    @Override
    void perform() {
        System.out.println("C");
    }
}

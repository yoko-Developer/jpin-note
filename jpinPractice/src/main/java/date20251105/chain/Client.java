package date20251105.chain;

public class Client {
    public static void main(String[] args) {
        AbstractChain chain = Builder.build();
        chain.execute(Type.A);
        chain.execute(Type.B);
        chain.execute(Type.C);
    }

}

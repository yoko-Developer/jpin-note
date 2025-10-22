package day20251022;

public class B extends A {

    // オーバーライド
    @Override
            public void a() {
        System.out.println("B");
    }

    // 差分メソッド
    public void b() {
        System.out.println("B");
    }
}

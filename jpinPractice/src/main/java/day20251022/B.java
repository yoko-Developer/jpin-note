package day20251022;

// B側に継承関係がないとエラーになる
public class B extends A {

    // Aクラスではない差分をBクラスに追加
    @Override
            public void a() {
        System.out.println("B");
    }

    // 差分メソッド
    public void b() {
        System.out.println("B");
    }
}

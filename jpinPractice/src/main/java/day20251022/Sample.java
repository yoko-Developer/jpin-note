package day20251022;

public class Sample {
    public static void main(String[] args) {

        // A a = new B();
        // a.a();
        //a.b(); //コンパイルエラー

        // 実際使用するクラスを隠蔽する
        A a = Factory.create();
        a.a();
    }
}

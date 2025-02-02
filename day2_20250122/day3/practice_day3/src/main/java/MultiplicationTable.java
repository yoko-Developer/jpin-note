public class MultiplicationTable {
    // for文を使用せずメソッドを増やして再帰呼び出しする
    public static void test(int a, int b) {
        if (b < 10)
        {
            System.out.print(a * b);
            test(a, b + 1);
        }
    }
    public static void hoge(int a) {
        if (a < 10) {
            test(a, 1);
            // 改行
            System.out.println();
            hoge(a + 1);
        }
    }
    public static void main(String[] args) {
        hoge(1);
    }
}

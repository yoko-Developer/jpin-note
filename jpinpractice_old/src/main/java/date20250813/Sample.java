package date20250813;

public class Sample {
    public static void main(String[] args) {

        // コピーを作って変数を代入する
        Item apple = new Item();
        apple.name = "apple";
        apple.price = 100;

        // ヒープ領域から同じデータが共有されていることを確認するコードを作ってみよう
        Item apple2 = apple;
        System.out.println(apple.name);
        System.out.println(apple2.name);
    }
}

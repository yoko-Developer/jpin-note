package date20250813;

public class AccessModifierSample {
    public static void main(String[] args) {
        // コピーを作って変数を代入する
        Item apple = new Item();
        // 赤線出るので修正 setNameの引数に値を入れる
        apple.setName("apple");
        apple.setPrice(100);

        // ヒープ領域から違うデータが共有されていることを確認するコードを作ってみよう
        Item apple2 = apple;
        // 出力もgetする必要がある
        System.out.println(apple.getName());
        System.out.println(apple2.getPrice());
    }
}

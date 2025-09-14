package date20250813;

public class AccessModifierItem {

    // アクセス修飾子追加：privateをつけると呼び出し側にsetterを付けなきゃエラー
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this: 自分自身のインスタンスを指す
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

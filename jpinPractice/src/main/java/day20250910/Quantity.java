package day20250910;

// Quantityクラスを追加
public class Quantity {

    // このクラス知らなきゃならない数量(amount)というフィールドを持つ
    // データを入れるためのコンストラクタを持つ
    // 書き換えできないようにfinalにする
    private final int amount;

    public Quantity(int amount) {
        if (amount < 0 || 100 < amount) {

            System.out.println("illegal quantity size");
            System.exit(0);
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

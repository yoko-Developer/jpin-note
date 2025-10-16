package day20250917;

import day20250917.Price;

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

    public Price calc(Price p) {
        Price result = new Price(0, Currency.YEN);
        for (int i = 0; i < this.amount; i++) {
            result = result.plus(p);
        }
        return result;
    }

    public int getAmount() {
        return amount;
    }
}

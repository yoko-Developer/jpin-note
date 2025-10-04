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

    if(price ==null)

    {
        System.out.println("invalid price");
        System.exit(0);
    }

    this.name =name;
    this.price =price;
}

public Price multi(Quantity qty) {
    Price result = new Price(0, Currency.YEN);
    for (int i = 0; i < qty.getAmount(); i++) {
        result = result.plus(this.price);
    }
    return result;
    }
}

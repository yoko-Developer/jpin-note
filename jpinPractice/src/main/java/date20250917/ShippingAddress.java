package date20250917;


// Prefecture型に変更
// finalに変更
// リファクタしてrenameしてsetを消す
public class ShippingAddress {

    private final String postalCode;
    private final Prefecture prefecture;
    private final String city;
    private final String address;
    private final String address2;
    private final String phoneNumber;

    // 引数が多い場合はコンストラクタではなくBuilderを用意する方が良い
    // コンストラクタと違ってbuilderは増えても順番が変わっても問題ない
    private ShippingAddress(Builder builder) {
        this.postalCode = builder.postalCode;
        this.prefecture = builder.prefecture;
        this.city = builder.city;
        this.address = builder.address;
        this.address2 = builder.address2;
        this.phoneNumber = builder.phoneNumber;
    }

    // クラスの中にクラスを作る（インナークラス）というテクニックを使う
    // ShippingAddressクラスの中にこのクラスに関わりが強いクラス、インスタンスを生成する時にしか使わないクラスを作る
    // アウタークラス（ShippingAddress）をインナークラスが使う場合staticを使う->インスタンスを作る必要がなくなるから
    // アウタークラスと同じビルダークラスにもsetterだけ使う
    // setterはvoidだが全部Builderをつけて自分自身を戻すように変更する(return this)
    // ⭐️全部voidをBuilderに変更する->Builderのセッターメソッドを呼ぶとBuilderが戻ってくる

    // public void setPostalCode(String postalCode){
    public static class Builder {

        private String postalCode;
        private Prefecture prefecture;
        private String city;
        private String address;
        private String address2;
        private String phoneNumber;

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder prefecture(Prefecture prefecture) {
            this.prefecture = prefecture;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // ShippingAddress型を戻すShippingAddressのインスタンス生成を目的としたクラス
        public ShippingAddress build() {
            return new ShippingAddress(this);
        }
    }
}

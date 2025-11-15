package date20250917;

// ShippingAddressクラスを使うSample2クラス
// コンストラクタが長くなるが、staticを使えばアウタークラスのインスタンスを作る必要がなくなるのでこれでOK
public class Sample2 {
    public static void main(String[] args) {

        ShippingAddress.Builder builder =
                new ShippingAddress.Builder();

        ShippingAddress address =
                builder
                        .postalCode("123-456") // build型を返している
                        .prefecture(Prefecture.TOKYO) // build型を返している
                        .city("Shinjuku-ku") // build型を返している
                        .address("XXX") // build型を返している
                        .phoneNumber("03-1234-5678") // build型を返している
                        .build(); // ここでようやくShippingAddress型を返す

    }
}

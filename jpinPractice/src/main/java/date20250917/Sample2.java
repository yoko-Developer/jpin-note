package date20250917;

// ShippingAddressクラスを使うSample2クラス
// コンストラクタが長くなるが、staticを使えばアウタークラスのインスタンスを作る必要がなくなるのでこれでOK
public class Sample2 {
    public static void main(String[] args) {

        ShippingAddress.Builder builder =
                new ShippingAddress.Builder();

        ShippingAddress address =
                builder
                        .postalCode("123-456")
                        .prefecture(Prefecture.TOKYO)
                        .city("Shinjuku-ku")
                        .address("XXX")
                        .phoneNumber("03-1234-5678")
                        .build();

    }
}

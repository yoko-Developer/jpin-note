package date20250723;

public class Array {
    public static void main(String[] args) {
        // 初期化値を使う
        int[] array = new int[3];

        // 従来のfor文は1個飛ばしで出力したい場合くらいしか使わない
        // 配列の範囲外のバグ
        for (int i = 0; i < 4; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}

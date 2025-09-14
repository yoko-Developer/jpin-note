package date20250723;

public class Array {
    public static void main(String[] args) {
//      初期化子を使う
//      int[] array = new int[3];

        // 通常の配列
        int[] array = {10, 20, 30};
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

//         for (int i = 0; i < 4; i++) {
//      従来のfor文は1個飛ばしで出力したい場合くらいしか使わない
        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // 拡張for文
        for (int n : array) {
            System.out.println(n);
        }
    }
}

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        // try-with-resources構文を使用してScannerを作成
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = new int[3];

            // ユーザーから3つの値を入力させる
            System.out.println("Enter 3 integers:");

            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter value for array[" + i + "]: ");
                array[i] = sc.nextInt(); // ユーザーから整数を入力
            }

            // 配列の合計値を計算
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            // 平均値を計算して表示
            double average = sum / (double) array.length;
            System.out.println("The average value is: " + average);

            // 普通のfor文で配列の要素を表示
            System.out.println("\n普通のfor文での表示:");
            for (int i = 0; i < array.length; i++) {
                System.out.println("array[" + i + "]: " + array[i]);
            }

            // 拡張for文で配列の要素を表示
            System.out.println("\n拡張for文での表示:");
            for (int num : array) {
                System.out.println("配列の要素: " + num);
            }

            // 合計と平均を再度表示
            System.out.println("\n合計: " + sum);
            System.out.println("平均値: " + average);
        }
    }
}

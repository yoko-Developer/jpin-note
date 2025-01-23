public class ArrayFor {
    public static void main(String[] args) {
        int[] array = new int[3];

        int sum = 0;

        // 配列の初期化
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        // 普通のfor文
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]: " + array[i]);
            sum += array[i];
        }

        // 平均値
        double average = sum / (double) array.length;
        System.out.println("合計: " + sum);
        System.out.println("平均値: " + average);

        // 拡張for文
        System.out.println("-------------------");
        System.out.println("拡張for文での実装");
        sum = 0;
        for (int num : array) {

            System.out.println("配列の要素: " + num);
            // 合計値
            sum += num;
        }
            // 平均値
            average = sum / (double) array.length;

            System.out.println("合計: " + sum);
            System.out.println("平均値: " + average);
    }
 }

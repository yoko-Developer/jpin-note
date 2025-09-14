package date20250723;

public class Triangle {
    public static void main(String[] args) {

        // 横を制御する
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
        }
        System.out.println("---");

        // 三角形が出力するようにしよう
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                // 改行なし
                System.out.print("*");
            }
            // 1行終わったら改行
            System.out.println();
        }
    }
}

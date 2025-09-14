package date20250723;

public class Triangle {
    public static void main(String[] args) {

        // 横を制御する
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

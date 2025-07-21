public class TimesTable_2nd {
    public static void test(int a, int b) {
        if (b < 10)
        {
        System.out.println(a * b);
        test(a, b + 1);
        }
    }
    public static void main(String[] args) {
        test(2, 1);
    }
}

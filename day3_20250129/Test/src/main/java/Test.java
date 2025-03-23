public class Test {
    public static void main(String[] args) {
        String str1 = "Java";               // 文字列プール
        String str2 = new String("Java");   // ヒープメモリ
        String str3 = "Java";               // 文字列プール（str1と同じ）

        System.out.println((str1 == str2) + " " + (str1 == str3));
    }
}

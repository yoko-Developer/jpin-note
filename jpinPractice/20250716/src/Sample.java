
public class Sample {
	public static void main(String[] args) {
		// 初期化しないとコンパイルエラーになる
		int a = 10;
		int b = ++a;
		int c = a++;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

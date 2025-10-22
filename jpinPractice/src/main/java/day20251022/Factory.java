package day20251022;

// インスタンスを請け負ってくれるクラス
public class Factory {
    public static A create() {
        // 戻り値でポリモーフィズムを表現している
        // ここだけを変更することで、呼び出す側に影響がない
        return new B();
    }
}

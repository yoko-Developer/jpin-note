public class Stack {

    // 0で初期化すると０から入れられる。どこまで入れられたか確認する
    private int index = 0;
    private String[] values = new String[10];

    public void push(String value) {
        this.values[this.index] = value;
            // ++だとnullを返すので--だったらCBAと出力する
                this.index++;
    }

    public String pop() {
        this.index--;
        return this.values[this.index];
    }
}

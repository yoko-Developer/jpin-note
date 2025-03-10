public class List {

    private int index;
    private String value;

    // 自分で自分を呼び出す再帰
    private List next;

    public List() {
        this.index = 0;
        this.value = null;
    }

    private List(int index) {
        this.index = index;
        this.value = null;
    }

    public void add(String value) {
        if (this.value == null) {
            this.value = value;
            return;
        }
        if (this.next == null) {
            this.next = new List(this.index +1);
        }
            this.next.add(value);
        }

        public int size() {

        // 宿題
        if (this.next != null) {
            return this.index + 1;
        } else {
            return this.next.size();
        }
    }

    // 添え字の中身を戻したい1番目：A、2番目：Bを出すように書く
    public String get(int index) {
        if (index == this.index) {
            return this.value;
        } else {
            return this.get(this.next.index);
        }
    }
}

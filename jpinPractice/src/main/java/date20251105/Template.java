package date20251105;

public abstract class Template {

    public void test() {
        System.out.println("test");
        // 自分自身のhogeを呼ぶことができる
        hoge();
        System.out.println("finish");
    }

    // public abstract void hoge();
    // publicを外す
    abstract void hoge();
};

package date20251022;

public class Calculator {

    // 2つ値を持たせて計算させる
    // 四則演算を意識しないという意図を持つクラスとする(Operatorクラスに持たせる)
    private int num1;
    private int num2;

    private Operator operator;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setOperator(Operator operator) {
        // operator: plusとかminusとか
        this.operator = operator;
    }
    public int getResult() {
        return operator.execute(num1,num2);
    }

}

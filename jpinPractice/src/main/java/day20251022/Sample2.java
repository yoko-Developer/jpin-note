package day20251022;

public class Sample2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setNum1(6);
//        cal.setOperator(new Plus());
//        cal.setOperator(new Minus());
        cal.setOperator(new Divide());
        cal.setNum2(3);
        int result = cal.getResult();
        System.out.println(result);
    }
}

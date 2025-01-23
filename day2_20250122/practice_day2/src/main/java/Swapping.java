public class Swapping {
    public static void main(String[] args) {
        int array[] = new int[3];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        System.out.println("array[0]: " + array[0]); // 10
        System.out.println("array[1]: " + array[1]); // 20
        System.out.println("array[2]: " + array[2]); // 30
        System.out.println("------------");


        // 0と1を入れ替える
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        // 結果を表示
        System.out.println("0と1を入れ替える");
        System.out.println("array[0]: " + array[0]); // 20
        System.out.println("array[1]: " + array[1]); // 10
        System.out.println("array[2]: " + array[2]); // 30
    }
}

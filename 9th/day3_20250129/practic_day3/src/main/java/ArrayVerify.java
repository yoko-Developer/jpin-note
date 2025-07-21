public class ArrayVerify {
    // arrayとarray2の参照先検証
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 10;
        int[] array2 = array;
        System.out.println(array2[0]);
        System.out.println(array == array2);
        System.out.println(array.equals(array2));
    }
}

import java.util.Arrays;import java.lang.String;
public class without0and1ex30 {
    public static void main(String[] args) {
        int[] array = { 50, 77, 12, 54, -11};
        System.out.println("original array:" + Arrays.toString(array));
        System.out.println("Result:" +test(array));
    }

    static boolean test(int[] array) {
        for (int arr : array) {
        if (arr == 0 || arr == -1) {
         return false;
            }
            }
         return true;
            }
            }
import java.util.Arrays;import java.lang.String;
public class ex31 {
    public static void main(String[] args) {
        int[] array = {10, 11, 23, 10, 35, 20, 10};
        System.out.println("Oringinal:" + Arrays.toString(array));
        int searchnum = 10;
        int fixnum = 30;
        System.out.println("Result:" + result(array, searchnum, fixnum));
    }

    static boolean result(int[] array, int searchnum, int fixnum) {
        int tempsum = 0;
        for (int i : array) {
            if (i == searchnum) {
                tempsum += searchnum;
            }
            if (tempsum > fixnum) {
                break;
            }
        }

        return tempsum == fixnum;
    }
}
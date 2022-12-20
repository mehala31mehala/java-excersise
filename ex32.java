import java.util.Arrays;import java.lang.String;

public class ex32 {
    public static void main(String[] args) {
        int[] arr = {77, 77, 65, 65, 65, 77};
        System.out.println("original array:" + Arrays.toString(arr));
        int num1 = 65;
        int num2 = 77;
        System.out.println("result:" + test(arr,num1,num2));
    }
        static boolean test( int[] arr, int num1, int num2){
            for (int i : arr) {
                boolean r = (i != num1 && i != num2);
                if (r) {
                    return false;
                }
            }
            return true;
        }
    }

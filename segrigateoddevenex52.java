import java.util.Arrays;
import java.lang.String;
public class segrigateoddevenex52 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("original array:" + Arrays.toString(arr));
        int result[];
        result = oddeven(arr);
        System.out.println(Arrays.toString(result));

    }

    static int[] oddeven(int[] arr) {
        int temp;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (arr[i] % 2 == 0 && i < j) {
                i++;
            }
            while (arr[j] % 2 == 1 && i < j) {
                j--;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
        }
        return arr;
    }
}
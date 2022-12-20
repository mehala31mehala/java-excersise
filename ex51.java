import java.util.Arrays;import java.lang.String;
public class ex51 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        System.out.println("oringnal array:" + Arrays.toString(arr));
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int left=arr[i];
            int right=arr[j];
            if (left == 0) {
                i++;
            }
            if (right == 1) {
                j--;
            }
            if (left== 1 && right== 0) {
                arr[i] = right;
                arr[j] = left;
                i++;
                j++;

            }

        }
        for (int a = 0; a < arr.length; a++) {
        }
            System.out.println(Arrays.toString(arr));

        }
    }

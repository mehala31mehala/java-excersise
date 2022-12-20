import java.util.Arrays;import java.lang.String;
public class ex59 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, -7, 5, 8, -5};
        System.out.println("oringinal array:" + Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        max_product(arr, max);


    }

    static void max_product(int[] arr, int max) {
        int max_i = -1, max_j = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[i] * arr[j]) {
                    max = arr[i] * arr[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

                System.out.println("pair is (" + arr[max_i] + "," + arr[max_j] + "),max product:" + arr[max_i] * arr[max_j]);
            }

        }


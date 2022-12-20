import java.util.Arrays;import java.lang.String;
public class secondsmallestex18 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, 5, 6};
        System.out.println("original array:" + Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                secondmin = min;
            } else if (arr[i] < min) {
                secondmin = min;
                min = arr[i];
            } else if (arr[i] < secondmin) {
                secondmin = arr[i];
            }
        }
        System.out.println("first minimum:"+min);
        System.out.println("second smallest:" + secondmin);

        }
    }


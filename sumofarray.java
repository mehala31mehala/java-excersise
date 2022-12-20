import java.lang.String;
public class sumofarray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i:array)
            sum += i;
            System.out.println("sum of value:" + sum);

        }
    }

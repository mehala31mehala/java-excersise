import java.util.Arrays;import java.lang.String;
public class ex48 {
    public static void main(String[] args) {
        int[] a = {-1, 8, -3, -2, 5, 3, -2, -4,6,9};
        int temp;
        System.out.println("given array:" + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] >  a[j]) {//to solve ex49 change the > to <(o/p is:9,8,7,6,5,3,-1,-2,-2,-3,-4)
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int num: a) {
        }
        System.out.println(Arrays.toString(a));
    }
}
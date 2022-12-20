import java.util.Arrays;
import java.lang.String;
public class ex58 {
    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        int p = A.length;
        int q = B.length;
        System.out.println("oringinal array of A:" + Arrays.toString(A));
        System.out.println("oringinal array of B:" + Arrays.toString(B));
        merge_sorted_array(A, p, B, q);
        System.out.println("A:" + Arrays.toString(A));
        System.out.println("B:" + Arrays.toString(B));
    }

    public static void merge_sorted_array(int[] A, int p, int[] B, int q) {
        for (int i = 0; i < p; i++) {
            if (A[i] > B[0]) {
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;
                int firstarr = B[0];
                int k;
                for ( k = 1; k < q && B[k] < firstarr; k++) {
                    B[k - 1] = B[k];
                }
                B[k - 1] = firstarr;
            }
        }
    }

}
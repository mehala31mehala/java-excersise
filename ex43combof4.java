import java.lang.String;
public class ex43combof4 {
    public static void main(String[] args) {
        int[] array = {20, 30, 35, 5, 10, 15, 10, 25};
        int num = 50;
        System.out.println("sum of 4 elements:"+num);
        for (int i = 0; i < array.length - 3; i++) {
        for (int j = i+1; j < array.length - 2; j++) {
        for (int k = j+1; k < array.length - 1; k++) {
        for (int l = k+1; l < array.length; l++) {
        if (array[i] + array[j] + array[k] + array[l] == num) {
        System.out.println("combination of 4 elements:" + array[i] + " " + array[j] + " " + array[k] + " " + array[l]);
        }
       }
       }
       }
       }
       }
       }

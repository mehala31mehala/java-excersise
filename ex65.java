import java.util.Arrays;
import java.lang.String;
public class ex65 {
    public static void main(String[] args){
        int[] arr={ 2, 3, 1, 7, 9, 5, 11, 3, 5};
        System.out.println("oringinal array:"+ Arrays.toString(arr));
        difference_array(arr);
        System.out.println(" maximum difference between two elements:"+difference_array(arr));
    }
    static int difference_array(int[] arr){
        int diff=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length;j++){
         diff=Integer.max(diff,arr[j]-arr[i]);
        }
        }
        return diff;
    }
}

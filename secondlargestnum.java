import java.util.Arrays;import java.lang.String;
public class secondlargestnum {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("original array:"+Arrays.toString(arr));
        Arrays.sort(arr);
        int index=arr.length-1;
        while(arr[index]==arr[arr.length-1]){
            index--;
        }
        System.out.println("second largest:"+arr[index]);
    }


}

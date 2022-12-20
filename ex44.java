import java.util.Arrays;import java.lang.String;
public class ex44 {
    public static void main(String[] args){
        int[] arr={6, 7, 9, 16, 25, 12, 30, 40};
        System.out.println("oringinal array:"+Arrays.toString(arr));
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            int x=i+2;
        for(int j=i+1;j<arr.length;j++){
        while(x<arr.length&&arr[i]+arr[j]>arr[x])
            x++;
            count+=x-j-1;
        }
        }
        System.out.println(count);
        }
    }


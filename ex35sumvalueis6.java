import java.lang.String;
public class ex35sumvalueis6 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int sum=6;
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
        if(arr[j]==sum-arr[i])
            System.out.println(arr[i] + "," + arr[j]);
        }
        }
        }
    }


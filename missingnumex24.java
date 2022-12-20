import java.util.Arrays;import java.lang.String;
public class missingnumex24 {
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        int sum=0;
        int n = 7;//total number
        int req=n*(n+1)/2;//sum of the total numbers=28
        for(int i=0;i<n-1;i++) {
            sum += arr[i];//sum of the given numbers=24
        }
        System.out.println("missing number:"+(req-sum));//28-24=4
        }
    }


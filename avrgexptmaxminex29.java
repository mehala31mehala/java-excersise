import java.lang.String;import java.util.Arrays;
public class avrgexptmaxminex29 {
    public static void main(String[] args){
    int[] arr={5,7,2,4,9};
    System.out.println("original array:"+ Arrays.toString(arr));
    int max=arr[0];
    int min=arr[0];
    float sum=arr[0];
    for(int i=1;i<arr.length;i++){
    sum+=arr[i];
    if(arr[i]>max)
    max=arr[i];
    else if(arr[i]<min)
    min=arr[i];
    }
    float x=((sum-max-min)/(arr.length-2));
    System.out.println("average of an array except the largest and smallest number:"+"\n"+x);

    }
    }


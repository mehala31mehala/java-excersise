import java.lang.String;
public class commonex25 {
    public static void main(String[] args){
        System.out.println("common elements are:");
        int[]arr1={2,4,8,10};
        int[]arr2={2,3,4,5,8,9};
        int[]arr3={2,3,4,6,8};
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length&&k<arr3.length){
        if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]) {
            System.out.println(arr1[i]);
            i++;
            j++;
            k++;
        }else if(arr1[i]<arr2[j]){
            i++;
        }else if(arr2[j]<arr3[k]){
            j++;
        }else{
            k++;
        }
        }

    }
}

import java.util.Arrays;import java.lang.String;
public class reversearray {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,10};
        System.out.println("oringinal array:"+Arrays.toString(a));
        for(int i=0;i<a.length/2;i++){
            int num=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=num;
        }
        System.out.println("reverse array:"+Arrays.toString(a));
    }
}

import java.util.Arrays;import java.lang.String;
public class copyarrayex8 {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};
        int[] newarray=new int[7];
        System.out.println("given array:"+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            newarray[i]=a[i];
        }
        System.out.println("copied array:"+Arrays.toString(newarray));
    }


}

import java.util.Arrays;import java.lang.String;
public class insertarrayex9 {
    public static void main(String[] args){
        int[] num={1,2,3,4,5,6,7,8,9};
        System.out.println("original array:"+Arrays.toString(num));
        int position=0;
        int add=2;
        for(int i=num.length-1;i>position;i--){
            num[i]=num[i-1];
        }
        num[position]=add;
        System.out.println("after insert an element:"+Arrays.toString(num));

    }
}

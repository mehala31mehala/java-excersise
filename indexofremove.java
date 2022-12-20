import java.util.Arrays; import java.lang.String;
public class indexofremove {
    public static void main(String[] args ){
        int[] numbers={1,2,3,4,5,6,7,8,9};
        System.out.println("oringinal array:"+Arrays.toString(numbers));
        int remove=3;
        for(int i=remove;i<numbers.length-1;i++){
            numbers[i]=numbers[i+1];
        }
        System.out.println("after remove element of  array:"+Arrays.toString(numbers));
    }

}

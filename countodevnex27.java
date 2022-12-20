import java.lang.String;
import java.util.Arrays;

public class countodevnex27 {
    public static void main(String[] args){
        int[] array={1,4,5,3,8,6,9,24};
        System.out.println("original array:"+ Arrays.toString(array));
        int count=0;
        for(int i=0;i<array.length;i++){
        if(array[i]%2==0){
            count++;
        }
        }
        System.out.println("even:"+count);
        System.out.println("odd:"+(array.length-count));
        }
    }


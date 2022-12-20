import java.lang.String;
public class arrayspecify {
    static boolean arrayspecify(int[] arr,int j){
        for(int i:arr){
            if(j==i){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        int[] array={1234,1985,1672,1990,2002,2000,2013};
        System.out.println(arrayspecify(array,2000));
        System.out.println(arrayspecify(array,2015));
    }

}

import java.lang.String;
public class hulting {
    public static void main(String[] args) {
        int value = sum(2, 4);
        System.out.println(value);
    }
    static int sum(int start,int end){
        if(end>start){
            return end+sum(start,end-1);
        }else{
            return 0;
        }

    }


}

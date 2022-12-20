import java.lang.String;
public class evennum {
    public static void main(String[] args){
       int num=100;
       System.out.println("list of even numbers 1 to 100:");
       for(int i=1;i<=num;i++){
           if(i%2==1){
               System.out.println(i);
           }
       }
    }
}

 import java.lang.String;
public class primenum {
    public static void main(String[] args){
        int count;
        //int num=0;
       // int sum=1;
        System.out.println("prime numbers between 1 to 100");
        for(int j=2;j<=100;j++) {
           count=0;


        for(int i=1;i<=j;i++) {
            if (j % i == 0) {
                count++;

            }
        }
        if(count==2){
            System.out.println(j);

            }
        }
    }
}





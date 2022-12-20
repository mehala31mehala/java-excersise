import java.lang.String;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=input.nextInt();
        int var=1;
        int number=8;
        for(int i=1;i<=number;i++) {
            var = var * i;
        }
            System.out.println("factorial of "+number+"is:"+var);
        }
    }


import java.lang.String;
import java.util.Scanner;
public class bhuvi_ex {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        System.out.println(myMethod(num));
    }
    static boolean myMethod(int num){
        if(num%5==0) {
            return true;
        }
        return false;
        }
    }


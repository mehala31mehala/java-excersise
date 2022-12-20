import java.lang.String;import java.util.Scanner;
public class remindrquotient {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("remainder:"+(num1%num2));
        System.out.println("quotient:"+(num1/num2));
    }
}

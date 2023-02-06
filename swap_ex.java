import java.lang.String;
import java.util.Scanner;
public class swap_ex {
    public static void main(String args[]) {
        System.out.println("enter the values:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("after swapping" + num1);
        System.out.println(num2);

    }
}

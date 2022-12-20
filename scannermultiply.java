import java.util.Scanner;import java.lang.String;
public class scannermultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number 1");
        int num1 = input.nextInt();
        System.out.println("enter the number 2");
        int num2 = input.nextInt();
        System.out.println("Multiply of two numbers:" + (num1 * num2));
    }
}
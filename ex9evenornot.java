import java.util.Scanner;import java .lang.String;
public class ex9evenornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = input.nextInt();
        System.out.println(even(number));
        }
        static boolean even(int num) {
        if (num % 2 == 0) {
            System.out.println("the number is even");

            return true;
        } else {
            System.out.println("the number is odd");

            return false;
        }

    }
}
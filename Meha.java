import java.util.Scanner;
import java.lang.String;
public class Meha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int num1 = in.nextInt();
        System.out.println("number");
        int num2 = in.nextInt();
        for (int i = num1;i<=num2; i++) {
            if (i % 5 == 0) {
                System.out.print("Hii");
            } else if (i % 7 == 0) {
                System.out.print("Hello");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("Hii hello");
            } else {
                System.out.print("Hello hii");
            }

        }
    }

        }




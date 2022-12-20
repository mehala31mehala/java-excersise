import java.util.Scanner;import java.lang.String;
public class
ex10palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = input.nextInt();
        System.out.println(palindrome(number));
    }

    static int palindrome(int number) {
        int original = number;
        int check = 0;
        int reverse = 0;
        while (number > 0) {
            reverse = number % 10;
            number = number / 10;
            check = check * 10 + reverse;
        }
         if(original==check){
             System.out.println("the number is palindrome");
        } else {
             System.out.println("the number is not palindrome");
            }
            return original;
        }

    }

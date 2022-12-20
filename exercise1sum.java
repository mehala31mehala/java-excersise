import java.util.Scanner; import java.lang.String;
public class exercise1sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("enter the number:");
        System.out.println("sum value is:" + sum(num));
    }

    static int sum(long num) {
        int result = 0;
        for (int i = 0; i<num; i++) {
            result += num % 10;
            num/=10;
        }
        return result;
    }
}
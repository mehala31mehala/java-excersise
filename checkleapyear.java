import java.util.Scanner; import java.lang.String;
public class checkleapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println(checkleapyear(year));
    }

    static int checkleapyear(int year) {

       if (year % 100 == 0&&year%400==0||year%100!=0&&year%4==0) {
           System.out.println("it is  a leap year");
       }else{
            System.out.println("it is not a leap year");

        }
        return year;

    }
}
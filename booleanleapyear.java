import java.util.Scanner;import java.lang.String;
public class booleanleapyear {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        System.out.println(checkleapyear(year));
    }
    static boolean checkleapyear(int year){
        boolean a=(year%4==0);
        boolean b=(year%100!=0);
        boolean c=(year%400==0)&&(year%4==0);
        return a&&(b||c);
    }
}
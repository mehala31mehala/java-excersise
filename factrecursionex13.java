import java.util.Scanner;import java.lang.String;
public class factrecursionex13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=input.nextInt();
        System.out.println(fact(num));
    }
    static int fact(int num) {
        int var = 1;
        for (int i = 1; i <= num; i++) {
            var=var*i;
        }
       return var;
    }
}

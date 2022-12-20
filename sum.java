import java.util.Scanner; import java.lang.String;
public class sum {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("enter the num1:");
        int k = M.nextInt();
        System.out.println("enter the num2:");
        int j = M.nextInt();
        int sum=0;
        for (int i = k; i < j; i++) {
            //System.out.println(i);
            sum =sum+(k+j);
        }
        System.out.println(sum);


    }

   }





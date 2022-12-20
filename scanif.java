import java.util.Scanner; import java.lang.String;
public class scanif {
    public static void main(String[] args){
       Scanner object=new Scanner(System.in);
       System.out.println("Enter the value A:");
       int num1=object.nextInt();
       System.out.println("Enter the value B:");
       int num2=object.nextInt();
       if (num2>num1) {
           System.out.println("A is greater than B ");
       } else {
           System.out.println("B is greater than A");

       }
       }

    }

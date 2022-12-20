import java.util.Scanner; import java.lang.String;
public class ifelse {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int num1=input.nextInt();
        System.out.println("Enter the value of y:");
        int num2=input.nextInt();
        System.out.println("Enter the value of z:");
        int num3=input.nextInt();
        if ((num3==num2)&&(num1==num2)){
            System.out.println("the values are  same");
        }else if ((num2==num3)&&(num3==num1)){
            System.out.println("the values are same");
        } else{
            System.out.println("the values are not same");
        }
        }
    }
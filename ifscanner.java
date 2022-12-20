import java.util.Scanner; import java.lang.String;
public class ifscanner {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int val1= obj.nextInt();
        System.out.println("Enter the value of B:");
        int val2= obj.nextInt();
        System.out.println("Enter the value of C:");
        int val3= obj.nextInt();
        if((val1!=val2)&&(val2!=val3)) {
            System.out.println("the values are not equal");
        }else{
            System.out.println("the values are equal");
        }
    }
}


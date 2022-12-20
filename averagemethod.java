import java.util.Scanner; import java.lang.String;
public class averagemethod {
   public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the values:");
       double a=input.nextDouble();
       double b=input.nextDouble();
       double c=input.nextDouble();
       System.out.println("the average is:"+average(a,b,c)+"\n");
   }
       static double average(double a,double b,double c){

       return (a+b+c)/3;
       }

}

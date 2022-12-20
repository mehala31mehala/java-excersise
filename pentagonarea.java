import java.util.Scanner;import java.lang.String;
public class pentagonarea {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of  sides of the pentagon:");
        int n=input.nextInt();
        System.out.println("enter the side of a pentagon:");
        double m=input.nextDouble();
        System.out.println("area of the pentagon is:"+areapentagon(n,m));
    }
    static double areapentagon(int n,double m){
        return n*m*m/(4*Math.tan(Math.PI/n));
    }
}

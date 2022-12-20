import java.util.Scanner;import java.lang.String;
public class taskmethodoverloading {

        public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the addition and modulas  values");
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        System.out.println(add(x,y,z));
        System.out.println(mod(x,y,z));
        System.out.println("Enter the subraction value");
        long a=input.nextLong();
        long b=input.nextLong();
        long c=input.nextLong();
        System.out.println(sub(a,b,c));
        System.out.println("Enter the multiplication value");
        float d=input.nextFloat();
        float e=input.nextFloat();
        float f=input.nextFloat();
        System.out.println(mult(d,e,f));
        System.out.println("Enter the division value");
        double g=input.nextDouble();
        double h=input.nextDouble();
        double i=input.nextDouble();
        System.out.println(div(g,h,i));
      }
    static int add(int x,int y,int z) {
        return x + y + z;
    }
    static long sub(long a,long b,long c) {
        return a - b - c;
    }
    static float mult(float d,float e,float f) {
        return d * e * f;
    }
    static double div(double g,double h,double i){
        return g / h / i;
    }
    static int mod(int x,int y,int z) {
        return x % y % z;
    }
    }


import java.lang.String;
public class metdoverload {
    static int operatormethod(int x,int y,int z){
        return x+y+z;
    }
    static float operatormethod(float x,float y,float z){
        return x*y*z;
    }
    static double operatormethod(double a,double b,double c){
        return a-c-b;
    }
    public static void main(String[] args){
        int num1=operatormethod(10,25,78);
        float num2=operatormethod(33,25,11);
        double num3=operatormethod(56.9,234.7,8.00);
        System.out.println("int:"+num1);
        System.out.println("float:"+num2);
        System.out.println("double:"+num3);

    }

}


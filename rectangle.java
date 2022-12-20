import java.lang.String;
import java.util.Scanner;
public class rectangle {
    int width;

    int length;



public  rectangle(int width,int length) {
        this.width = width;
        this.length = length;

}
public int area() {
    return width* length;
}

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the width of the rectangle" );
        int s1=input.nextInt();
        int s2=input.nextInt();
        System.out.println("enter the length of the rectangle" );
        int s3=input.nextInt();
        int s4=input.nextInt();
        rectangle obj=new rectangle(s1,s2);
        rectangle obj1=new rectangle(s3,s4);
        System.out.println("Area of the triangle:"+obj.area());
        System.out.println(obj1.area());

}
}

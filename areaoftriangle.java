import java .util.Scanner; import java.lang.String;
public class areaoftriangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the height and base:");
        int height=input.nextInt();
        int base =input.nextInt();
        int area=height*base/2;
        System.out.println("The area of the triangle is:"+area(height,base));
    }
    static int area(int x,int y){
        return x*y/2;

    }
}

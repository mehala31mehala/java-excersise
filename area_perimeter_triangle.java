import java.lang.String;
public class area_perimeter_triangle {
    int s1;
    int s2;
    int s3;

    public double area() {
        double s = (s1 + s2 + s3) /2.0;
        return (Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)));
    }

    public int perimeter() {
        return (s1 + s2 + s3);
    }

    public static void main(String[]args){
        area_perimeter_triangle obj = new area_perimeter_triangle();
        obj.s1 = 3;
        obj.s2 = 4;
        obj.s3 = 5;
        System.out.println("Area of the triangle:" + obj.area());
        System.out.println("Perimeter of the triangle:" + obj.perimeter());
    }
}

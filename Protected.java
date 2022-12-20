import java.lang.String;
public class Protected {
    protected String fname="Swetha";
    protected String lname="Mehala";
    protected String deg="B.sc";
    protected int age=20;

}
class Student extends Protected {
    private int graduate_year = 2022;

    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("name:" + obj.fname + " " + obj.lname);
        System.out.println("degree:" + obj.deg);
        System.out.println("age:" + obj.age);
        System.out.println("gratuate_year:" + obj.graduate_year);
    }
}
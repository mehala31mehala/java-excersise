import java.lang.String;
public class Student1 {
        String name;
        int roll_no;
 public Student1(String n,int r){
     name=n;
     roll_no=r;
 }
    public static void main(String[] args){
        Student1 object=new Student1("John",2);
        System.out.println("Student name:"+object.name);
        System.out.println("Roll_no:"+object.roll_no);
    }
}

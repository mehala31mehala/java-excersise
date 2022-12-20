package inheritance;
import java.lang.String;
public class print {
    public static void main(String[] args) {
        teacher my=new teacher("keerthi","B.sc",22,5000,25);
        student obj=new student("mehala",12,"A","TMK");
       System.out.println("Teacher details:");
        System.out.println("Name of the Teacher:"+my.getName());
        System.out.println("Degree:"+my.getDeg());
        System.out.println("Age:"+my.getAge());
        System.out.println("Salary:"+my.getSalary());
        System.out.println("No_of_students:"+my.getNo_of_students());
        System.out.println("\n");
        System.out.println("Student details:");
        System.out.println("Name of the Student:"+obj.getName());
        System.out.println("Standard:"+obj.getStd());
        System.out.println("Section:"+obj.getSec());
        System.out.println("Address:"+obj.getAdd());
    }

}

package inheritance;
import java.lang.String;
public class teacher {
      public String getName() {
            return name;
      }
      public String getDeg() {
            return deg;
      }
      public int getAge() {
            return age;
      }
      public int getSalary() {
            return salary;
      }
      public int getNo_of_students() {
            return no_of_students;
      }

      public void setDetails(String name,String deg,int age,int salary,int no_of_students) {
            this.name = name;
            this.deg=deg;
            this.age=age;
            this.salary=salary;
            this.no_of_students=no_of_students;
      }
   private String name;
   private String deg;
   private int age;
   private int salary;
   private  int no_of_students;

   public teacher(String k,String Deg,int Age,int sal,int no_students){
       name=k;
       deg=Deg;
       age=Age;
       salary=sal;
       no_of_students= no_students;
   }
}

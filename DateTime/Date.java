package DateTime;
import java.time.LocalDate;
import java.time.LocalTime;
public class Date {
    public static void main(String[]args){
        LocalDate myObj=LocalDate .now();
        LocalTime myObj1=LocalTime.now();
        System.out.println(myObj);
        System.out.println(myObj1);
    }
}

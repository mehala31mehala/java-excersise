import java.util.Scanner; import java.lang.String;
public class methodstringtask {
    public static void main(String[] args){
        Scanner name=new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstname=name.nextLine();
        System.out.println("Enter the last name");
        String lastname=name.nextLine();
        System.out.println(firstname+" "+lastname);
    }
    static void stringmethod(String fname){
        System.out.println(fname+"lastname");
    }
}

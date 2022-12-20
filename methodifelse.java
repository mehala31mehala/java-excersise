import java.lang.String;
public class methodifelse {
    static void checkage(int age) {
        if (age>18) {
            System.out.println("eligible for vote");
        } else {
            System.out.println("not eligible for vote");
        }
    }
        public static void main(String[] args){
        checkage(25);
    }
}

import java.util.Scanner; import java.lang.String;
public class scanner {
    public static void main(String[]  args){
       Scanner input=new Scanner(System.in);
       System.out.println("username");
       String name=input.nextLine();
       System.out.println("username:"+name);
    }
}

import java.util.Scanner;import java.lang.String;
public class dayif {
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        System.out.println("enter any day  number");
         int d=t.nextInt();
        if(d==1){
            System.out.println("sunday");
        } else if (d == 2) {
            System.out.println("monday");
        } else if (d == 3) {
            System.out.println("tuesday");
        }else if(d==4){
            System.out.println("wednesday");
        }else if(d==5){
            System.out.println("thursday");
        }else if(d==6){
            System.out.println("friday");
        }else if(d==7){
            System.out.println("saturday");
        }
    }
}
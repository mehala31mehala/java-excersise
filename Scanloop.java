import java.util.Scanner; import java.lang.String;
public class Scanloop {
    public static void main(String[] args){
        int s;
        Scanner obj=new Scanner(System.in);
        System.out.println("devided by 2");
        System.out.println("devided by 5");
        s= obj.nextInt();
        for(int i=1;i<100;i++){
            if((i%2==0)||(i%5==0)){
                System.out.println(i);
            }
        }
    }
}

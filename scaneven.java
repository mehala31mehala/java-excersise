import java.util.Scanner; import java.lang.String;
public class scaneven {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("List of even numbers:");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++ ){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}

import java.util.Scanner;import java.lang.String;
public class maxminmethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values:");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        System.out.println("maximum number is:" +max(x,y,z));
        System.out.println("minimum number is:"+min(x,y,z));
    }
    static int max(int x,int y,int z){
        return Math.max(Math.max(x,y),z);
    }
    static int min(int x,int y,int z){
        return Math.min(Math.min(x,y),z);
    }
}

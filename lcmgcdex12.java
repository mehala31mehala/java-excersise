import java.util.Scanner;import java.lang.String;
public class lcmgcdex12 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("enter x");
        int x = v.nextInt();
        System.out.println("enter y");
        int y = v.nextInt();
        System.out.println("GCD="+GCD(x, y));
        System.out.println("LCM="+LCM(x, y));
    }

    static int GCD(int x, int y) {
        int z = 0;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                z = i;

            }
        }
            return z;
        }
        static int LCM ( int x, int y){
            int g =0;
            for (int i = 1; i<=x; i++) {
                if ( x%i == 0 && y%i == 0) {
                    g=i;
                    int lcm=x*y/g;
                }
            }
            return g;
        }
    }

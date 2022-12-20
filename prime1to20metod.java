import java.lang.String;
public class prime1to20metod {
    public static void main(String[] args) {
        for (int i = 1; i<=20; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
        static boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
        }


}
